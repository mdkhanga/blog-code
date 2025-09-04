package com.mj.crdt;

import java.util.*;


import java.util.*;

class CRDTText {

    private final Map<String, CRDTChar> chars = new HashMap<>();
    private final String nodeId;
    private long lamport = 0;

    public CRDTText(String nodeId, Map<String, Character> sharedInitial) {
        this.nodeId = nodeId;
        // Copy shared initial characters
        for (Map.Entry<String, Character> e : sharedInitial.entrySet()) {
            chars.put(e.getKey(), new CRDTChar(e.getKey(), e.getValue()));
        }
        // lamport starts after the highest shared numeric ID
        lamport = sharedInitial.keySet().stream()
                .mapToLong(k -> Long.parseLong(k.split("-")[0]))
                .max().orElse(0);
    }

    private String generateId() {
        lamport++;
        return lamport + "-" + nodeId;
    }

    public void insert(char value) {
        String id = generateId();
        chars.putIfAbsent(id, new CRDTChar(id, value));
    }

    public void delete(String id) {
        CRDTChar ch = chars.get(id);
        if (ch != null && !ch.isDeleted) {
            ch.delete();
            // propagate delete to children (updates)
            for (CRDTChar c : chars.values()) {
                if (c.parents.contains(id)) delete(c.id);
            }
        }
    }

    public void update(String id, char newValue) {
        CRDTChar oldChar = chars.get(id);
        if (oldChar != null && !oldChar.isDeleted) {
            String newId = generateId();
            CRDTChar newChar = new CRDTChar(newId, newValue);
            newChar.addParent(id);
            chars.put(newId, newChar);
            delete(id);
        }
    }

    public void merge(CRDTText other) {
        lamport = Math.max(this.lamport, other.lamport);
        for (CRDTChar otherChar : other.chars.values()) {
            CRDTChar existing = chars.get(otherChar.id);
            if (existing == null) {
                CRDTChar c = new CRDTChar(otherChar.id, otherChar.value);
                c.parents.addAll(otherChar.parents);
                if (otherChar.isDeleted) c.delete();
                chars.put(c.id, c);
            } else if (otherChar.isDeleted) {
                delete(existing.id);
            }
        }
    }

    public String getText() {
        List<CRDTChar> sorted = new ArrayList<>(chars.values());
        Collections.sort(sorted);
        StringBuilder sb = new StringBuilder();
        for (CRDTChar ch : sorted) if (!ch.isDeleted) sb.append(ch.value);
        return sb.toString();
    }

    // For demo: get IDs of current characters (excluding deleted)
    public List<String> getIds() {
        List<String> ids = new ArrayList<>();
        chars.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> { if (!e.getValue().isDeleted) ids.add(e.getKey()); });
        return ids;
    }
}







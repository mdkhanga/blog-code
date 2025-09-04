package com.mj.crdt;

import java.util.Set;
import java.util.HashSet;


class CRDTChar implements Comparable<CRDTChar> {
    final String id;
    final char value;
    boolean isDeleted;
    final Set<String> parents;

    CRDTChar(String id, char value) {
        this.id = id;
        this.value = value;
        this.isDeleted = false;
        this.parents = new HashSet<>();
    }

    void addParent(String parentId) { parents.add(parentId); }

    void delete() { isDeleted = true; }

    @Override
    public int compareTo(CRDTChar other) { return this.id.compareTo(other.id); }
}

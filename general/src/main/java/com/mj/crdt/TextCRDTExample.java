package com.mj.crdt;

import java.util.Map;

public class TextCRDTExample {
    public static void main(String[] args) {
        // Shared initial text with IDs
        Map<String, Character> sharedInitial = Map.of(
                "1-A", 'A',
                "2-A", 'B',
                "3-A", 'C',
                "4-A", 'D'
        );

        CRDTText nodeA = new CRDTText("A", sharedInitial);
        CRDTText nodeB = new CRDTText("B", sharedInitial);

        // Node A edits: add 'e', update 'B' -> 'b'
        nodeA.insert('e');
        nodeA.update("2-A", 'b');

        // Node B edits: add 'F', delete 'C', delete 'B' (conflict)
        nodeB.insert('F');
        nodeB.delete("3-A"); // C
        nodeB.delete("2-A"); // B

        // Merge nodes
        nodeA.merge(nodeB);
        nodeB.merge(nodeA);

        System.out.println("Node A text: " + nodeA.getText());
        System.out.println("Node B text: " + nodeB.getText());
    }

}

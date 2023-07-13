package com.mj.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// Leetcode 133
public class CloneGraph {

    private Node[] cloneStore = new Node[101];

    public Node cloneGraph(Node node) {
        return cloneNode(node);
    }

    private Node cloneNode(Node n) {

        if (n == null) {
            return null;
        }

        if (cloneStore[n.val] != null) {
            return cloneStore[n.val];
        }

        Node newNode = new Node(n.val) ;
        cloneStore[n.val] = newNode;
        List<Node> newNodeNeighbours = new ArrayList<>();
        // clone and set neighbours
        for (int i = 0; i < n.neighbors.size(); i++) {
            Node newNeighbour = cloneNode(n.neighbors.get(i));
            newNodeNeighbours.add(newNeighbour);
        }

        newNode.neighbors = newNodeNeighbours;
        return newNode;
    }

    public static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }

    }
}



package com.mj.leetcode;

public class SumNodesEvenGrapdParent {
    public int sumEvenGrandparent(TreeNode root) {
        return sumEven(root, 1, 1);
    }

    private int sumEven(TreeNode root, int parent, int grandparent) {
        if (root == null) {
            return 0;
        }
        int v = grandparent % 2 == 0 ? root.val : 0;

        return  v + sumEven(root.left, root.val, parent) + sumEven(root.right, root.val, parent);

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

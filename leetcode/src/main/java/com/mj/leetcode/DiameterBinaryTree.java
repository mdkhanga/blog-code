package com.mj.leetcode;

public class DiameterBinaryTree {

    public int diameterOfBinaryTree(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int maxleft  = 0 ;
        int maxright = 0 ;

        if (root.left != null) {
            maxleft =  maxDepth(root. left);
        }

        if (root.right != null) {
            maxright = maxDepth(root.right);;
        }

        int maxdial = diameterOfBinaryTree(root.left);
        int maxdiar = diameterOfBinaryTree(root.right);

        return Math.max(maxright + maxleft, Math.max(maxdial, maxdiar)) ;

    }

    private int maxDepth(TreeNode n) {

        if (n == null) {
            return 0 ;
        }

        int max = Math.max(maxDepth(n.left), maxDepth(n.right));

        return 1 + max;
    }

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}

package com.mj.leetcode;

// Leetcode 98
// https://leetcode.com/problems/validate-binary-search-tree/
public class ValidateBST {

    public boolean isValidBST(TreeNode root) {

        return _valid(root, Long.MIN_VALUE, Long.MAX_VALUE) ;

    }

    private boolean _valid(TreeNode node, long min, long max) {

        if (node == null) {
            return true ;
        }

        if (node.val <= min || node.val >= max) {
            return false ;
        }

        return _valid(node.left, min, node.val) && _valid(node.right, node.val, max) ;
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

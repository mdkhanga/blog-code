package com.mj.leetcode;

public class LowestCommonAncestorBST {

    TreeNode lca = null ;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return dfs(root, p, q);


    }

    private TreeNode dfs(TreeNode node, TreeNode p, TreeNode q) {

        if (node == null) {
            return null;
        }

        if (node.val == p.val || node.val == q.val) {
            return node;
        }
        else if ( node.val < p.val && node.val < q.val )  {
            return dfs(node.right,p,q);
        } else if (node.val > p.val && node.val > q.val) {
            return dfs(node.left,p,q);
        } else {
            return null;
        }
    }

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}

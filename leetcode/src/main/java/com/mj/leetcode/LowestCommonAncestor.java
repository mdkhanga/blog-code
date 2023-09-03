package com.mj.leetcode;

public class LowestCommonAncestor {

    TreeNode lca = null ;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        dfs(root, p, q);

        return lca ;
    }

    private int dfs(TreeNode node, TreeNode p, TreeNode q) {

        int ret = 0 ;

        if (node == null) {
            return 0;
        }

        if (node.val == p.val || node.val == q.val) {
            ret++;
        }

       int left = dfs(node.left, p, q) ;
       int right = 0 ;

       if (ret + left < 2 ) {
           right = dfs(node.right, p, q);
       }

       ret = ret + left + right ;

       if (ret == 2 && lca == null) {
           lca = node ;
       }

       return ret ;
    }

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}

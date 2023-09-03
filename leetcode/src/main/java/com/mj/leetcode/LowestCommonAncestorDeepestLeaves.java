package com.mj.leetcode;

// Leetcode 1173
public class LowestCommonAncestorDeepestLeaves {

    TreeNode lca;
    int maxDepth;

    public TreeNode lcaDeepestLeaves(TreeNode root) {

        dfs(root, 0);
        return lca ;
    }

    public int dfs(TreeNode n, int d) {

        if( n == null) {
            return d ;
        }

        d++;

        int l = dfs(n.left, d);
        int r = dfs(n.right, d);

        if (l == r ) {

            if (l >= maxDepth) {
                maxDepth = l;
                lca = n;
            }
        }


        return Math.max(l,r);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}

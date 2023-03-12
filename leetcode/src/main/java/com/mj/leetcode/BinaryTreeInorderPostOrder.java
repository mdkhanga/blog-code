package com.mj.leetcode;

import java.util.HashMap;

//Leetcode 106
// https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
public class BinaryTreeInorderPostOrder {

    private HashMap<Integer,Integer> inorderMap = new HashMap<>();
    private HashMap<Integer,Integer> postorderMap = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        int in_len = inorder.length;
        int post_len = postorder.length;

        for(int i = 0; i < in_len ; i++) {
            inorderMap.put(inorder[i],i);
        }

        for(int i = 0; i < in_len ; i++) {
            postorderMap.put(postorder[i],i);
        }

        return _buildTree( inorder, 0, in_len -1, postorder, 0, post_len -1  );

    }

    public TreeNode _buildTree(int[] inorder, int in_start, int in_end,
                        int[] postorder, int post_start, int post_end)  {

        TreeNode n = new TreeNode(postorder[post_end]);

        if ((in_start > in_end)) {
            return null;
        }

        if ((in_start == in_end)) {
            return n;
        }

        // post_end is root
        int in_lindex = inorderMap.get(postorder[post_end]); // index of root in inorder
        int post_lindex = in_lindex > 0 ? postorderMap.get(inorder[in_lindex-1]): post_end -1 ;

        if (in_lindex > in_start) {
            n.left = _buildTree(inorder, in_start, in_lindex - 1, postorder, post_start, post_lindex);
        } else {
            n.left = null ;
        }

        if (in_lindex < in_end ) {
            n.right = _buildTree(inorder, in_lindex + 1, in_end, postorder, post_lindex + 1, post_end - 1);
        } else {
            n.right = null;
        }

        return n ;

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

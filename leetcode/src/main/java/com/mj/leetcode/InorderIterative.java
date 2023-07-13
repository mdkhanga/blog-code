package com.mj.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Leetcode 94
public class InorderIterative {



    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root == null) {
            return ret;
        }

        TreeNode curr = root;
        stack.push(curr);

        while (!stack.empty()) {
            curr = curr.left;
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            while (curr == null && !stack.empty()) {
                curr = stack.pop();
                ret.add(curr.val);
                curr = curr.right;
            }

            if (curr != null) {
                stack.push(curr);
            }
        }

        return ret;
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

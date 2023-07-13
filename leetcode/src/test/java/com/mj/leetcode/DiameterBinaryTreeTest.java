package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class DiameterBinaryTreeTest {

    DiameterBinaryTree d = new DiameterBinaryTree();

    @Test
    public void test1() {

        Integer[] input = {4,-7,-3,null,null,-9,-3,9,-7,-4,null,6,null,-6,-6,null,null,0,6,5,null,9,null,null,-1,-4,null,null,null,-2};

        DiameterBinaryTree.TreeNode root = build(input) ;

        int ret = d.diameterOfBinaryTree(root) ;

        assertEquals(8,ret);

    }

    private DiameterBinaryTree.TreeNode build(Integer[] input) {

        Queue<DiameterBinaryTree.TreeNode> q = new ArrayDeque<>();

        int i = 0 ;
        DiameterBinaryTree.TreeNode root = new DiameterBinaryTree.TreeNode(input[0]);
        i++ ;

        q.add(root);

        while(i < input.length && !q.isEmpty()) {
            DiameterBinaryTree.TreeNode n = q.poll();
            if (input[i] != null) {
                n.left = new DiameterBinaryTree.TreeNode(input[i]);
                q.add(n.left);
            }
            i++;
            if (i < input.length ) {
                if (input[i] != null) {
                    n.right = new DiameterBinaryTree.TreeNode(input[i]);
                    q.add(n.right);
                }
                i++;;
            }
        }

        return root;
    }

}
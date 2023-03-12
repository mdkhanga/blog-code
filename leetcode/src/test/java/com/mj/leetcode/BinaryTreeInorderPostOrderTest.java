package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeInorderPostOrderTest {

    BinaryTreeInorderPostOrder bst = new BinaryTreeInorderPostOrder();

    @Test
    public void test1() {

        int[] inorder = {9,3,15,20,7} ;
        int[] postorder = {9,15,7,20,3};

        BinaryTreeInorderPostOrder.TreeNode ret = bst.buildTree(inorder, postorder);

        System.out.println(ret.val);

    }

    @Test
    public void test2() {

        int[] inorder = {2,1} ;
        int[] postorder = {2,1};

        BinaryTreeInorderPostOrder.TreeNode ret = bst.buildTree(inorder, postorder);

        System.out.println(ret.val);

    }

    @Test
    public void test3() {

        int[] inorder = {1,2} ;
        int[] postorder = {2,1};

        BinaryTreeInorderPostOrder.TreeNode ret = bst.buildTree(inorder, postorder);

        System.out.println(ret.val);

    }

}
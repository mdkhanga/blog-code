package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateBSTTest {

    ValidateBST v = new ValidateBST();

    @Test
    public void test1() {
        ValidateBST.TreeNode t = new ValidateBST.TreeNode(2147483647);

        assertTrue(v.isValidBST(t));
    }

    @Test
    public void test2() {
        ValidateBST.TreeNode t = new ValidateBST.TreeNode(-2147483648);
        ValidateBST.TreeNode t1 = new ValidateBST.TreeNode(2147483647);

        t.left = null ;
        t.right = t1;

        assertTrue(v.isValidBST(t));
    }

    @Test
    public void test3() {
        ValidateBST.TreeNode t = new ValidateBST.TreeNode(2147483647);
        ValidateBST.TreeNode t1 = new ValidateBST.TreeNode(2147483647);

        t.left = t1 ;
        t.right = null;

        assertFalse(v.isValidBST(t));
    }

}
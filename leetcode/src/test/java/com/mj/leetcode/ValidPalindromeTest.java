package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Leetcode 125
class ValidPalindromeTest {

    ValidPalindrome v = new ValidPalindrome();

    @Test
    public void test1() {
        boolean ret = v.isPalindrome(" ");
        assertTrue(ret);

    }

    @Test
    public void test2() {
        boolean ret = v.isPalindrome("0P");
        assertFalse(ret);

    }
}
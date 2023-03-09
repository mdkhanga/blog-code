package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapLongestRepeatingCharTest {

    SwapLongestRepeatingChar sw = new SwapLongestRepeatingChar();
    @Test
    public void test1() {
        int res = sw.maxRepOpt1("ababa");
        assertEquals(3,res);
    }

    @Test
    public void test2() {
        int res = sw.maxRepOpt1("aaabaaa");
        assertEquals(6,res);
    }

    @Test
    public void test3() {
        int res = sw.maxRepOpt1("ababa");
        assertEquals(3,res);
    }

}
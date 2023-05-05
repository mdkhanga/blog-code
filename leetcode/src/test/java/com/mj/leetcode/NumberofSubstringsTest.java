package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberofSubstringsTest {

    NumberofSubstrings ns = new NumberofSubstrings();

    @Test
    public void test1() {
        String s = "abcabc";
        int ret = ns.numberOfSubstrings(s);
        assertEquals(10, ret);

    }

    @Test
    public void test2() {
        String s = "aaacb";
        int ret = ns.numberOfSubstrings(s);
        assertEquals(3, ret);

    }

    @Test
    public void test3() {
        String s = "abc";
        int ret = ns.numberOfSubstrings(s);
        assertEquals(1, ret);

    }
}
package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedSubstringTest {

    RepeatedSubstring rs = new RepeatedSubstring();

    @Test
    public void test1() {

        assertTrue(rs.repeatedSubstringPattern("abcabcabcabc"));


    }

    @Test
    public void test2() {

        assertFalse(rs.repeatedSubstringPattern("aba"));

    }

    @Test
    public void test3() {

        assertFalse(rs.repeatedSubstringPattern("aabaaba"));

    }
}
package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularExpTest {

    RegularExp r = new RegularExp();

    @Test
    public void test1() {
        boolean res = r.isMatch("aab","c*a*b");

        assertEquals(true, res);
    }

    @Test
    public void test2() {
        boolean res = r.isMatch("ab",".*c");

        assertEquals(false, res);
    }

    @Test
    public void test3() {
        boolean res = r.isMatch("aaa","a*a");

        assertEquals(true, res);
    }

}
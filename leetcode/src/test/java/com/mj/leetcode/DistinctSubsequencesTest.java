package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistinctSubsequencesTest {

    DistinctSubsequences ds = new DistinctSubsequences();

    @Test
    public void test1() {
        int ret = ds.numDistinct("rabbbit","rabbit") ;

        assertEquals(3, ret);
    }

    @Test
    public void test2() {
        int ret = ds.numDistinct("babgbag","bag") ;

        assertEquals(5, ret);
    }
}
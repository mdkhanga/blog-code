package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubArrayDeleteOneTest {

    LongestSubArrayDeleteOne ld = new LongestSubArrayDeleteOne();

    @Test
    public void test1() {

        int[] input = {0,1,1,1,0,1,1,0,1} ;

        int ret = ld.longestSubarray(input);

        assertEquals(5, ret);

    }

}
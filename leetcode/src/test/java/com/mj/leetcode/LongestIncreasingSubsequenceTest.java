package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingSubsequenceTest {

    LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();

    @Test
    public void test1() {
        int[] nums = {10,9,2,5,3,7,101,18} ;
        int ret = lis.lengthOfLIS(nums);
        assertEquals(4, ret);

    }

    @Test
    public void test2() {
        int[] nums = {0,1,0,3,2,3} ;
        int ret = lis.lengthOfLIS(nums);
        assertEquals(4, ret);

    }

    @Test
    public void test3() {
        int[] nums = {7,7,7,7,7,7,7} ;
        int ret = lis.lengthOfLIS(nums);
        assertEquals(1, ret);

    }

    @Test
    public void test4() {
        int[] nums = {4,10,4,3,8,9} ;
        int ret = lis.lengthOfLIS(nums);
        assertEquals(3, ret);

    }

    @Test
    public void test5() {
        int[] nums = {1,3,6,7,9,4,10,5,6} ;
        int ret = lis.lengthOfLIS(nums);
        assertEquals(6, ret);

    }
}
package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxNetworkRankTest {

    MaxNetworkRank mn = new MaxNetworkRank();

    @Test
    public void test() {

        int[][] input = {{0,1},{0,3},{1,2},{1,3}};

        int ret = mn.maximalNetworkRank(4, input);

        assertEquals(4, ret);

    }

    @Test
    public void test2() {

        int[][] input = {{0,1},{0,2}};

        int ret = mn.maximalNetworkRank(3, input);

        assertEquals(2, ret);

    }


    @Test
    public void test3() {

        int[][] input = {{0,1},{1,2},{2,3},{2,4},{5,6},{5,7}};

        int ret = mn.maximalNetworkRank(8, input);

        assertEquals(5, ret);

    }
}
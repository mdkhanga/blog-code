package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuySellStock3Test {

    BestTimeToBuySellStock3 b = new BestTimeToBuySellStock3();

    @Test
    public void test1() {
        int[] prices = {3,3,5,0,0,3,1,4};
        int profit = b.maxProfit(prices);
        assertEquals(6,profit);
    }

    @Test
    public void test2() {
        int[] prices = {1,2,3,4,5};
        int profit = b.maxProfit(prices);
        assertEquals(4,profit);
    }

    @Test
    public void test3() {
        int[] prices = {7,6,4,3,1};
        int profit = b.maxProfit(prices);
        assertEquals(0,profit);
    }

    @Test
    public void test4() {
        int[] prices = {0,0,3,1,4};
        int profit = b.maxProfit(prices);
        assertEquals(6,profit);
    }

    @Test
    public void test5() {
        int[] prices = {1,2,3,4,5};
        int profit = b.maxProfit(prices);
        assertEquals(4,profit);
    }

    @Test
    public void test6() {
        int[] prices = {3,1,4};
        int profit = b.maxProfit(prices);
        assertEquals(3,profit);
    }

}
package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuySellStockTest {

    BestTimeToBuySellStock bs = new BestTimeToBuySellStock();

    @Test
    public void test1() {
        int[] prices = {7,1,5,3,6,4};
        int profit = bs.maxProfit(prices);
        assertEquals(5, profit);
    }

    @Test
    public void test2() {
        int[] prices = {7,6,4,3,1};
        int profit = bs.maxProfit(prices);
        assertEquals(0, profit);
    }
}
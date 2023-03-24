package com.mj.leetcode;

// Leetcode 121
public class BestTimeToBuySellStock {

    public int maxProfit(int[] prices) {

        int curr_min = prices[0] ;
        int max_profit = 0 ;
        for (int i = 1 ; i < prices.length ; i++) {
            if (prices[i] > curr_min) {
                int profit = prices[i] - curr_min;
                max_profit = Math.max(max_profit, profit);
            }
            if (prices[i] < curr_min) {
                curr_min = prices[i];
            }
        }

        return max_profit;
    }
}

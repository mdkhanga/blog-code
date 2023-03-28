package com.mj.leetcode;

//  Leetcode 123
public class BestTimeToBuySellStock3 {

    public int maxProfit(int[] prices) {

        int dp[][] = new int[prices.length][1]; // i = profit at prices[i], numTrades
        return tradeOrNot(0, false,0,prices,0,0) ;
    }

    public int tradeOrNot(int currentHold, boolean canSell, int index, int[] prices, int maxProfit, int numTrades) {

        if (index >= prices.length || numTrades >= 2) {
            return maxProfit;
        }

        if (currentHold <= 0 && !canSell) {
            // we can buy or choose not do anything
            // buy
            int profit1 = tradeOrNot(prices[index], true,index+1, prices, maxProfit, numTrades) ;
            int profit2 = tradeOrNot(currentHold, false,index+1, prices, maxProfit, numTrades) ;
            return Math.max(profit1, profit2);
        } else if (prices[index] > currentHold && canSell){
            // we can sell and record profit or not do anything
            int ProfitSofar = maxProfit + prices[index] - currentHold;
            int profit1 = tradeOrNot(0, false,index+1, prices, ProfitSofar, numTrades+1) ;
            // do nothing
            int profit2 = tradeOrNot(currentHold, true,index+1, prices, maxProfit, numTrades) ;
            return Math.max(profit1, profit2);
        } else {
            // do nothing
            return tradeOrNot(currentHold, canSell, index+1, prices, maxProfit, numTrades) ;
        }


    }
}

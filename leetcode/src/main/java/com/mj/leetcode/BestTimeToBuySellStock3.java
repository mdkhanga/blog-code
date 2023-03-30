package com.mj.leetcode;

//  Leetcode 123
public class BestTimeToBuySellStock3 {

    public int maxProfit(int[] prices) {

        int dp[][][] = new int[prices.length][3][2]; // i = max profit at i, with j trades allowed 0,1,2,0=canSell 1=cannot

        for (int i = 0 ; i < prices.length; i++) {
            for (int j =0 ; j < 3 ; j++) {
                for (int k = 0 ; k < 2 ; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }

        tradeOrNot(0, 1,0,prices,0,0,dp);


        return dp[0][0][1];
    }

    public int  tradeOrNot(int currentHold, int canSell, int index, int[] prices, int maxProfit, int numTrades, int[][][] dp) {

        if (index >= prices.length) {
            return 0 ;
        }

        if (numTrades == 2) {
            return 0 ;
        }

        if (dp[index][numTrades][canSell] != -1) {
            return dp[index][numTrades][canSell] ;
        }


        if  (canSell == 1) {
            // we can buy or choose not do anything
            // buy

            // if (dp[index+1][numTrades][0] < 0 ) {
            int buy =  -prices[index] + tradeOrNot(prices[index], 0,index+1, prices, maxProfit, numTrades,dp);
            // }
            // if (dp[index+1][numTrades][1] < 0 ) {
            int notbuy = tradeOrNot(currentHold, 1,index+1, prices, maxProfit, numTrades,dp);
            // }


            return dp[index][numTrades][1] = Math.max(buy, notbuy);

        } else {
            // canSell =0
            // we can sell and record profit or not do anything
            // int profitSofar = maxProfit + prices[index] - currentHold;
            int profitSofar = prices[index] - currentHold;
            // if (dp[index+1][numTrades+1][1] < 0) {

            int sell = prices[index] + tradeOrNot(0, 1,index+1, prices, profitSofar, numTrades+1,dp);
            // }
            // if (dp[index+1][numTrades][0] < 0) {
            int notsell = tradeOrNot(currentHold, 0 ,index+1, prices, maxProfit, numTrades,dp) ;
            // }
            return dp[index][numTrades][0] = Math.max(sell, notsell);

        }


    }
}

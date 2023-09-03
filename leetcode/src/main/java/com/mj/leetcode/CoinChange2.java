package com.mj.leetcode;

// Leetcode 518
public class CoinChange2 {

    public int change(int amount, int[] coins) {

        int size = coins.length;
        int[][] dp = new int[size][amount+1]; // dp[i][j] # for i coins j amount

        for (int i = 0 ; i < size ; i++) {
            dp[i][0] = 1;
        }

        for (int j = 0 ; j <= amount ; j++) {

            if (j % coins[0] == 0) {
                dp[0][j] = 1;
            } else {
                dp[0][j] = 0;
            }
        }

        for (int i = 1 ; i < size ; i++) {

            for (int j = 1 ; j <= amount ; j++) {


                dp[i][j] = dp[i-1][j];
                int n = 1 ;
                while (true) {

                    int contrib = n * coins[i];

                    if (contrib <= j) {
                        dp[i][j] = dp[i][j] + dp[i - 1][j - contrib];
                    } else {
                        break;
                    }
                    n++;
                }


            }

        }

        return dp[size-1][amount];

    }

}

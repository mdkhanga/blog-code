package com.mj.leetcode;

// Leetcode 62
public class UniquePath {
    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n] ;


        _uniquePaths(0,0, m, n, dp) ;

        return dp[0][0];
    }

    private void _uniquePaths(int x, int y, int m, int n, int[][] dp) {

        if ( (x == m-1) && (y == n-1) ) {
            dp[x][y] = 1;
            return ;
        }


        if (x < m-1 && y < n - 1) {

            if (dp[x+1][y] == 0) {
                _uniquePaths(x+1, y, m, n, dp);

            }

            if (dp[x][y+1] == 0) {
                _uniquePaths(x, y + 1, m, n, dp);
            }

            dp[x][y] = dp[x+1][y] + dp[x][y+1];
            return;

        }

        if (x < m-1) {

            if (dp[x+1][y] == 0) {
                _uniquePaths(x + 1, y, m, n, dp);
            }
            dp[x][y] = dp[x+1][y];
            return ;
        }

        if (y < n-1) {

            if (dp[x][y+1] == 0) {
                _uniquePaths(x, y + 1, m, n, dp);
            }
            dp[x][y] = dp[x][y+1];
            return ;
        }

    }
}

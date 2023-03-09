package com.mj.leetcode;

// Leetcode 63
public class UniquePath2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n] ;


        _uniquePaths(0,0, m, n, obstacleGrid, dp) ;

        return dp[0][0];
    }

    private void _uniquePaths(int x, int y, int m, int n, int[][] grid, int[][] dp) {

        if (grid[x][y] == 1) {
            dp[x][y] = 0;
            return;
        }

        if ( (x == m-1) && (y == n-1) && grid[x][y] != 1 ) {
            dp[x][y] = 1;
            return ;
        }


        if (x < m-1 && y < n - 1) {

            if (grid[x+1][y] != 1 && dp[x+1][y] == 0) {
                _uniquePaths(x+1, y, m, n, grid, dp);

            }

            if (grid[x][y+1] != 1 && dp[x][y+1] == 0) {
                _uniquePaths(x, y + 1, m, n, grid, dp);
            }

            dp[x][y] = dp[x+1][y] + dp[x][y+1];
            return;

        }

        if (x < m-1) {

            if (grid[x+1][y] != 1 && dp[x+1][y] == 0) {
                _uniquePaths(x + 1, y, m, n, grid, dp);
            }
            dp[x][y] = dp[x+1][y];
            return ;
        }

        if (y < n-1) {

            if (grid[x][y+1] != 1 && dp[x][y+1] == 0) {
                _uniquePaths(x, y + 1, m, n, grid, dp);
            }
            dp[x][y] = dp[x][y+1];
            return ;
        }

    }
}

package com.mj.leetcode;

// Leetcode 1254
public class NumClosedIslands {

    public int closedIsland(int[][] grid) {

        int rows = grid.length;
        int columns = grid[0].length;

        int numClosedIslands = 0 ;

        for (int c = 0 ; c < columns ; c++) {
            if (grid[0][c] == 0) {
                dfs(grid, rows, columns, 0, c);
            }
            if (grid[rows-1][c] == 0) {
                dfs(grid, rows, columns, rows - 1, c);
            }
        }

        for (int r = 0 ; r < rows ; r++) {
            if (grid[r][0] == 0) {
                dfs(grid, rows, columns, r, 0);
            }
            if (grid[r][columns-1] == 0) {
                dfs(grid, rows, columns, r, columns - 1);
            }
        }

        for (int i = 1 ; i < rows-1 ; i++ ) {
            for (int j = 1 ; j < columns-1 ; j++ ) {
                if (grid[i][j] == 0) {
                    numClosedIslands++;
                    dfs(grid, rows, columns, i, j);
                }

            }
        }

        return numClosedIslands;
    }

    private void dfs(int[][] grid, int m, int n, int row, int col) {

        if (row < 0 || row > m-1) {
            return;
        }

        if (col < 0 || col > n-1) {
            return ;
        }

        if (grid[row][col] != 0) {
            return;
        }

        grid[row][col] = -1;
        dfs(grid, m, n, row+1, col);
        dfs(grid, m, n, row-1, col);
        dfs(grid, m, n, row, col+1);
        dfs(grid, m, n, row, col-1);

    }
}

package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePath2Test {

    UniquePath2 up2 = new UniquePath2();

    @Test
    public void test1() {

        int[][] grid = {{1,0}} ;

        int res = up2.uniquePathsWithObstacles(grid);

        assertEquals(1, res);

    }

}
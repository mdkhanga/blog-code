package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Search2dMatrixTest {

    Search2dMatrix sd = new Search2dMatrix() ;

    @Test
    public void test1() {

        int[][] input = {{1,3,5,7},{10,11,16,20},{23,30,34,60}} ;

        boolean ret = sd.searchMatrix(input, 3) ;

        assertTrue(ret);
    }

    @Test
    public void test2() {

        int[][] input = {{1,3,5,7},{10,11,16,20},{23,30,34,60}} ;

        boolean ret = sd.searchMatrix(input, 13) ;

        assertFalse(ret);
    }

    @Test
    public void test3() {

        int[][] input = {{1},{3}} ;

        boolean ret = sd.searchMatrix(input, 3) ;

        assertTrue(ret);
    }

    @Test
    public void test4() {

        int[][] input = {{1,3,5,7},{10,11,16,20},{23,30,34,50}} ;

        boolean ret = sd.searchMatrix(input, 20) ;

        assertTrue(ret);
    }
}
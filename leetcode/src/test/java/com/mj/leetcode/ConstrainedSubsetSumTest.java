package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstrainedSubsetSumTest {

    ConstrainedSubsetSum c = new ConstrainedSubsetSum();

    @Test
    public void test1() {

        int[] input = {10,2,-10,5,20} ;
        int ret = c.constrainedSubsetSum(input, 2);
        assertEquals(37,ret);

    }

    @Test
    public void test2() {

        int[] input = {-1,-2,-3} ;
        int ret = c.constrainedSubsetSum(input, 1);
        assertEquals(-1,ret);

    }

    @Test
    public void test3() {

        int[] input = {10,-2,-10,-5,20} ;
        int ret = c.constrainedSubsetSum(input, 2);
        assertEquals(23,ret);

    }

    @Test
    public void test4() {

        int[] input = {-5266,4019,7336,-3681,-5767} ;
        int ret = c.constrainedSubsetSum(input, 2);
        assertEquals(11355,ret);

    }

    @Test
    public void test5() {

        int[] input = {-8269,3217,-4023,-4138,-683,6455,-3621,9242,4015,-3790} ;
        int ret = c.constrainedSubsetSum(input, 1);
        assertEquals(16091,ret);

    }

    @Test
    public void test6() {

        int[] input = {100,-10,-10,-10,-2,-2,-10,-100,15,-5,-10,10,2,-10,5,20} ;
        int ret = c.constrainedSubsetSum(input, 2);
        assertEquals(125,ret);

    }

}
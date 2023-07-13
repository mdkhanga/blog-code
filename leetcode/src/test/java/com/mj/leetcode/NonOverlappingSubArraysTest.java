package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonOverlappingSubArraysTest {

    NonOverlappingSubArrays n = new NonOverlappingSubArrays();

    @Test
    public void test1() {

        int[] input = {3,2,2,4,3} ;

        int ret = n.minSumOfLengths(input, 3);

        assertEquals(2, ret);

    }

    /*@Test
    public void test2() {

        int[] input = {4,3,2,6,2,3,4} ;

        int ret = n.minSumOfLengths(input, 3);

        assertEquals(-1, ret);

    }

    @Test
    public void test3() {

        int[] input = {3,1,1,1,5,1,2,1} ;

        int ret = n.minSumOfLengths(input, 3);

        assertEquals(3, ret);

    }


     */

    @Test
    public void test4() {

        int[] input = {4,3,2,6,2,3,4} ;

        int ret = n.minSumOfLengths(input, 6);

        assertEquals(-1, ret);

    }

    @Test
    public void test5() {

        int[] input = {1,2,2,3,2,6,7,2,1,4,8} ;

        int ret = n.minSumOfLengths(input, 5);

        assertEquals(4, ret);

    }

    @Test
    public void test6() {

        int[] input = {1,1,1,2,2,2,4,4} ;

        int ret = n.minSumOfLengths(input, 6);

        assertEquals(6, ret);

    }

    @Test
    public void test7() {

        int[] input = {2,2,4,4,4,4,4,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1} ;

        int ret = n.minSumOfLengths(input, 20);

        assertEquals(23, ret);

    }

    @Test
    public void test8() {
        String s = "manoj";
        n.writeText(s);
        System.out.println(s);
    }
}
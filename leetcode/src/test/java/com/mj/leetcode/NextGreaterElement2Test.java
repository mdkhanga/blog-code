package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextGreaterElement2Test {

    NextGreaterElement2 n = new NextGreaterElement2();

    @Test
    public void test1() {

        int[] input = {1,2,1} ;

        int[] ret = n.nextGreaterElements(input);

        int[] expected = {2,-1,2};
        assertArrayEquals(expected, ret);

    }

    @Test
    public void test2() {

        int[] input = {1,2,3,4,3} ;

        int[] ret = n.nextGreaterElements(input);

        int[] expected = {2,3,4,-1,4};
        assertArrayEquals(expected, ret);

    }

    @Test
    public void test3() {

        int[] input = {1,2,3,4,5} ;

        int[] ret = n.nextGreaterElements(input);

        int[] expected = {2,3,4,5,-1};
        assertArrayEquals(expected, ret);

    }

    @Test
    public void test4() {

        int[] input = {5,4,3,2,1} ;

        int[] ret = n.nextGreaterElements(input);

        int[] expected = {-1,5,5,5,5};
        assertArrayEquals(expected, ret);

    }
}
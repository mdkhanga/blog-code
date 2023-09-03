package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvoidFloodTest {

    AvoidFlood av = new AvoidFlood();

    @Test
    public void test1() {

        int[] input = {1,2,0,0,2,1} ;
        int[] expected = {-1,-1,2,1,-1,-1} ;

        int[] ret = av.avoidFlood(input);

        assertArrayEquals(expected, ret);

    }

    @Test
    public void test2() {

        int[] input = {1,0,2,0,2,1} ;
        int[] expected = {-1,1,-1,2,-1,-1} ;

        int[] ret = av.avoidFlood(input);

        assertArrayEquals(expected, ret);

    }

}
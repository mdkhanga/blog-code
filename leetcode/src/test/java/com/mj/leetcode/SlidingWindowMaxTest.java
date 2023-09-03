package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowMaxTest {

    SlidingWindowMax sm = new SlidingWindowMax();

    @Test
    public void test1() {

        int input[] = {1,3,-1,-3,5,3,6,7};

        int[] ret = sm.maxSlidingWindow(input, 3);

        int[] expected = {3,3,5,5,6,7} ;

        assertArrayEquals(expected, ret);

    }

}
package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinalPricesWithDiscountTest {

    FinalPricesWithDiscount f = new FinalPricesWithDiscount();

    @Test
    public void test1() {
        int[] input = {8,4,6,2,3} ;
        int[] ret = f.finalPrices(input);

        int[] expected = {4,2,4,2,3} ;

        assertArrayEquals(expected, ret);

    }

    @Test
    public void test2() {
        int[] input = {8,7,4,2,8,1,7,7,10,1} ;
        int[] ret = f.finalPrices(input);

        int[] expected = {1,3,2,1,7,0,0,6,9,1} ;

        assertArrayEquals(expected, ret);

    }
}
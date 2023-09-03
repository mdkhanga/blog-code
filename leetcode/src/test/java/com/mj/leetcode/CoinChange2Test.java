package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinChange2Test {

    CoinChange2 c = new CoinChange2();

    @Test
    public void test() {

        int[] input = {1,2,5} ;
        // int[] input = {1,2} ;
        int ret = c.change(5, input);

        assertEquals(4, ret);

    }

}
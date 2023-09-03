package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumPenaltyShopTest {

    MinimumPenaltyShop mps = new MinimumPenaltyShop();

    @Test
    public void test() {

        int ret = mps.bestClosingTime("YYNY");

        assertEquals(2, ret);

    }

}
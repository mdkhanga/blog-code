package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumStepsToReduceBinaryToOneTest {

    NumStepsToReduceBinaryToOne n = new NumStepsToReduceBinaryToOne();

    @Test
    public void test1() {

        int ret = n.numSteps("1101") ;
        assertEquals(6, ret);

    }

}
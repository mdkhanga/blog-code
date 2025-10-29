package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Leetcode1903Test {

    Leetcode1903 l = new Leetcode1903();

    @Test
    public void test1() {
        String ret = l.largestOddNumber("52");

        assertEquals("5", ret);

    }

    @Test
    public void test2() {
        String ret = l.largestOddNumber("7542351161");

        assertEquals("7542351161", ret);

    }

}
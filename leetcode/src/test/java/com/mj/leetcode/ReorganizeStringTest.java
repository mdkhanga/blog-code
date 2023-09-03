package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReorganizeStringTest {

    ReorganizeString rs = new ReorganizeString();

    @Test
    public void test1() {

        String ret = rs.reorganizeString("aab");

        assertEquals("aba",ret);


    }

}
package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsecCharsTest {

    ConsecChars c = new ConsecChars();

    @Test
    public void test1() {
        int ret = c.maxPower("leetcode");
        assertEquals(2, ret);

    }

}
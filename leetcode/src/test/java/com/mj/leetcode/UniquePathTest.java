package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePathTest {

    UniquePath up = new UniquePath();
    @Test
    public void test1() {

        int ret = up.uniquePaths(3,2);

        assertEquals(3, ret);

    }

    @Test
    public void test2() {

        int ret = up.uniquePaths(3,7);

        assertEquals(28, ret);

    }
}
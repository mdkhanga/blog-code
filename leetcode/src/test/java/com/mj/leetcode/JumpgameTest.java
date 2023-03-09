package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpgameTest {

    Jumpgame j = new Jumpgame();
    @Test
    public void test() {
        int[] nums = {2,0,0};
        boolean ans = j.canJump(nums);
        assertEquals(true, ans);
    }

}
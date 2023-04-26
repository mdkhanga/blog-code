package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubsetsTest {

    Subsets s = new Subsets();

    @Test
    public void test1() {
        int[] nums = {1,2,3};
        List<List<Integer>> res = s.subsets(nums);

        System.out.println(res);
    }

}
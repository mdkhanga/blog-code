package com.mj.leetcode;

import java.util.ArrayList;
import java.util.List;

// Leetcode 78
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        ret.add(new ArrayList<>()); // empty set
        return _subsets(nums, 0, ret);
    }

    private List<List<Integer>> _subsets(int[] nums, int index, List<List<Integer>> sofar) {

        if (index == nums.length) {
            return sofar;
        }

        List<List<Integer>> copy = new ArrayList<List<Integer>>(sofar) ;

        copy.forEach(list -> {
            list.add(nums[index]);
            sofar.add(list);
        });

        return _subsets(nums, index + 1, sofar);
    }
}

package com.mj.leetcode;

import java.util.ArrayList;
import java.util.Collections;
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

        List<List<Integer>> copy = new ArrayList<>();
        copy.addAll(sofar);

        copy.forEach(list -> {
            List<Integer> copyList = new ArrayList<>();
            copyList.addAll(list);
             copyList.add(nums[index]);
            sofar.add(copyList);
        });

        return _subsets(nums, index + 1, sofar);
    }
}

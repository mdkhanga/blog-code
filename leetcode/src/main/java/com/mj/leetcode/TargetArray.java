package com.mj.leetcode;

import java.util.ArrayList;
import java.util.List;

// Leetcode 1389
public class TargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ret = new ArrayList<>();

        for (int i = 0 ; i < nums.length ; i++) {
            ret.add(index[i], nums[i]);
        }

        int[] retA = new int[ret.size()];
        for (int i=0 ; i < ret.size() ;i++) {
            retA[i] = ret.get(i);
        }

        return retA;
    }

}

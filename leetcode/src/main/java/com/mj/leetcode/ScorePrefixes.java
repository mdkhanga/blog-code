package com.mj.leetcode;

public class ScorePrefixes {

    public long[] findPrefixScore(int[] nums) {

        long conv[] = new long[nums.length];
        long score[] = new long[nums.length];

        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            conv[i] = nums[i] + max ;

            if (i == 0) {
                score[i] = conv[i];
            } else {
                score[i] = score[i - 1] + conv[i];
            }
        }

        return score;
    }
}

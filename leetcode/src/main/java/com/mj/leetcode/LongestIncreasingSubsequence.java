package com.mj.leetcode;

// leetcode 300
public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {

        int dp[] = new int[nums.length];
        dp[0] = 1;

        for (int i = 1 ; i < nums.length; i++) {
            dp[i] = Integer.MIN_VALUE;
            for (int j = 0; j < i ; j++) {
                int max = nums[i] > nums[j] ? dp[j] + 1 : 1;
                dp[i] = Math.max(max, dp[i]);
            }
        }

        int max = 0;
        for (int i = 0 ; i < dp.length ; i++) {
            max = Math.max(max,dp[i]);
        }
        return max;
    }

}

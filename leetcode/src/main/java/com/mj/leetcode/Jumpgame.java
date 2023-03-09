package com.mj.leetcode;

public class Jumpgame {

    public boolean canJump(int[] nums) {
        Boolean[] dp = new Boolean[nums.length];
        reach(nums, 0, nums.length -1 , dp);
        if (dp[nums.length-1] != null) {
            return dp[nums.length - 1];
        } else {
            return false ;
        }
    }

    private void reach(int[] nums, int start, int end, Boolean[] dp) {
        if (start == end) {
            dp[start] = true;
            return;
        }
        int max = nums[start];
        if (max == 0) {
            dp[start] = false;
            return;
        }

        for (int i = max ; i >= 1 ; i--) {
            if (start + i <= end) {
                if (dp[start+i] == null) {
                    reach(nums, start + i, end, dp);
                }
                if (dp[start] != null) {
                    dp[start] = dp[start] || dp[start + i];
                } else {
                    dp[start] = dp[start + i];
                }
                if (dp[start] == true) {
                    break;
                }
            }
        }
    }
}

package com.mj.leetcode;

public class LongestSubArrayDeleteOne {

    // Leetcode 1493
    public int longestSubarray(int[] nums) {

        int max = 0 ;
        int left = 0; int right = -1;
        int currzeroct = 0 ;
        int currzeropos = -1;
        int currlen = 0;

        for (int i = 0 ; i < nums.length; i++) {
            right++;
            if (nums[i] == 1) {
                currlen++;
            } else {
                if (currzeroct == 1) {
                    // we need to end curr sub array
                    currlen = right - left ;
                    max = Math.max(max, currlen);
                    left = currzeropos + 1;
                } else {
                    currzeroct++;
                }
                currzeropos = i;
            }

        }

        currlen = right - left + 1;
        max = Math.max(max, currlen);

        return max - 1;
    }
}

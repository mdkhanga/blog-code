package com.mj.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class ConstrainedSubsetSum {
    public int constrainedSubsetSum(int[] nums, int k) {

        int size = nums.length;
        // int maxSum = nums[0];
        int maxSum = Integer.MIN_VALUE;
        int[] dp = new int[size];
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0 ; i < size ; i++ ) {

            int max = Math.max(0, deque.isEmpty() ? 0 : dp[deque.peekFirst()]);
            dp[i] = max + nums[i] ;
            maxSum = Math.max(maxSum, dp[i]);

            while(!deque.isEmpty() && dp[i] >= dp[deque.peekLast()]) {
                deque.pollLast();
            }

            deque.addLast(i);

            if ( i - deque.peekFirst() + 1 > k) {
                deque.removeFirst();
            }

        }

        /* dp[0] = nums[0];
        for (int i = 1 ; i < size ; i++) {

            int left = i - k  >=0 ? i - k   : 0 ;
            dp[i] = nums[i];

            for (int j = left ; j < i ; j++) {
                dp[i] = Math.max(dp[i], dp[j] + nums[i]);
            }

            maxSum = Math.max(maxSum, dp[i]);

        } */

        return maxSum;
    }
}

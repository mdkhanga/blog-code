package com.mj.leetcode;

import java.util.Stack;

// Leetcode 503
public class NextGreaterElement2 {

    public int[] nextGreaterElements(int[] nums) {

        int[] ret = new int[nums.length];
        int size = nums.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 2*size - 1 ; i >= 0  ; i--) {

            while(!stack.empty() && nums[stack.peek()] <= nums[i % size]) {
                stack.pop();
            }


            ret[i % size] = stack.isEmpty() ? -1 : nums[stack.peek()];


            stack.push(i % size);

        }

        return ret;
    }
}

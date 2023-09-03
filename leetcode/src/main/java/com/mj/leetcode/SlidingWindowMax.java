package com.mj.leetcode;

import java.util.*;

// Leetcode 239
public class SlidingWindowMax {

    public int[] maxSlidingWindow(int[] nums, int k) {

        int size = nums.length;

        List<Integer> retList = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0 ; i < k ; i++) {

            while(!deque.isEmpty() && nums[i] > nums[deque.peekLast()]) {
                deque.pollLast();
            }

            deque.offerLast(i);

        }

        retList.add(nums[deque.peekFirst()]);

        for (int i = k ; i < size ; i++) {

            while(!deque.isEmpty() && nums[i] > nums[deque.peekLast()]) {
                deque.pollLast();
            }

            while(!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst() ;
            }

            deque.offerLast(i);
            retList.add(nums[deque.peekFirst()]);

        }


        return retList.stream().mapToInt(Integer::intValue).toArray();


    }
}

package com.mj.leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

// Leetcode 225
public class Stackqueues {

    Queue<Integer> first = new ArrayDeque<>(100);
    Queue<Integer> second = new ArrayDeque<>(100);

    public Stackqueues() {

    }

    public void push(int x) {

            first.offer(x);

    }

    public int pop() {

        if (first.size() != 1) {
            int count = 0;
            int s = first.size();
            while(count < s-1) {
                second.offer(first.poll());
                count++;
            }
        }

        int ret = first.poll();

        Queue<Integer> tmp = first ;
        first = second;
        second = tmp ;

        return ret;
    }

    public int top() {


        if (first.size() == 1) {
            return first.peek();
        } else {
            int count = 0;
            int s = first.size();
            while(count < s-1) {
                second.offer(first.poll());
                count++;
            }
        }

       return first.peek();
    }

    public boolean empty() {

        return first.isEmpty() && second.isEmpty();
    }
}

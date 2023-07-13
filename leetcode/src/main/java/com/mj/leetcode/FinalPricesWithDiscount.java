package com.mj.leetcode;

import java.util.Stack;

// Leetcode 1475
public class FinalPricesWithDiscount {

    public int[] finalPrices(int[] prices) {
        int size = prices.length;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0 ; i < size  ; i++) {

            while(!stack.isEmpty() && prices[i] <= prices[stack.peek()] ) {
                int index = stack.pop();
                prices[index] = prices[index] - prices[i] ;

            }

            if (i < size-1 && prices[i] >= prices[i+1] ) {
                prices[i] = prices[i] - prices[i+1];
            }
            else
                stack.push(i);

        }
        return prices;
    }
}

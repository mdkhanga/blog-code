package com.mj.leetcode;

public class EqualSubStringsInBudget {

    public int equalSubstring(String s, String t, int maxCost) {

        int front =0 , back = 0;
        int cost = 0;
        int currlen = 0, maxlen = 0;
        int len = s.length();

        int[] diff = new int[len];

        for (int i = 0 ; i < len ; i++) {
            diff[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }

        while (front < len) {

            cost = cost + diff[front++] ;

            while(cost > maxCost && back < front) {
                cost = cost - diff[back] ;
                back++;
            }
            maxlen = Math.max(maxlen, front-back);
        }

        return maxlen ;
    }
}

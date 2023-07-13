package com.mj.leetcode;

public class ConsecChars {

    public int maxPower(String s) {

        int max = 0 ;
        int maxSoFar = 0;

        char prev = '-';
        for (int i = 0 ; i < s.length(); i++) {

            char c = s.charAt(i);
            if (c == prev) {
                max++;
            } else {
                maxSoFar = Math.max(maxSoFar, max);
                max = 1;
            }

            prev = c;
        }

        return Math.max(maxSoFar, max);
    }
}

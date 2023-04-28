package com.mj.leetcode;

import java.util.HashMap;
import java.util.Map;

// Leetcode 1358
public class NumberofSubstrings {
    public int numberOfSubstrings(String s) {

        int size = s.length();
        int ret = 0 ;
        if (size < 3) {
            return 0;
        }

        Map<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i <=2 ; i++) {
            char c = s.charAt(i);
            charCount.compute(c, (k, v) -> v == null ? 0 : v+1 );
        }

        int back = 0;
        int front = 2;

        while(back < size-2 && front < size) {
            if (checkValid(charCount)) {
                ret = ret + 1 + size - 1 - front;
                back++;
            } else {
                front++;
                char c = s.charAt(front);
                if (c == 'a') {
                    ++numa;
                }
                if (c == 'b') {
                    ++numb;
                }
                if (c == 'c') {
                    ++numc;
                }
            }

        }
        return ret;
    }

    private boolean checkValid(Map<Character, Integer> charCount) {
        if (charCount.computeIfAbsent('a', k -> 0 ) >= 1
            && charCount.computeIfAbsent('b', k -> 0 ) >= 1
            && charCount.computeIfAbsent('c', k -> 0 ) >= 1)
            return true ;
        else
            return false;
    }
}

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

        Map<Character, Integer> lastIndex = new HashMap<>(3);

        for (int i = 0; i <=2 ; i++) {
            char c = s.charAt(i);
            lastIndex.put(c, i );
        }

        int back = 0;
        int front = 2;

        int lastvalidback = -1 ;

        while(back <= size-3 && front <= size -1 ) {
            if (checkValid(lastIndex)) {
                ret = ret + 1 ; // this string
                ret = ret + size - 1 - front; // substrings for each char in front
                // ret = ret + back ; // substr for each char in back
                int start = getStartofSmallestSubstr(lastIndex);
                if (start > 0 && lastvalidback >= 0) {
                    ret = ret + start - lastvalidback - 1;
                } else {
                    ret = ret + start ;
                }
                // move the back 1 char front
                lastvalidback = back;
                char prev_b = s.charAt(back);
                final int prev_back = back ;
                lastIndex.compute(prev_b, (c, v) -> v == prev_back ? -1 : v);
                back++;
            }

            if (front < size - 1) {
                front++;
                char new_f = s.charAt(front);
                lastIndex.put(new_f, front );
            } else {
                break;
            }


        }
        return ret;
    }

    private boolean checkValid(Map<Character, Integer> charCount) {
        if (charCount.computeIfAbsent('a', k -> -1 ) >= 0
            && charCount.computeIfAbsent('b', k -> -1 ) >= 0
            && charCount.computeIfAbsent('c', k -> -1 ) >= 0)
            return true ;
        else
            return false;
    }

    private int getStartofSmallestSubstr(Map<Character, Integer> map) {
        int min = map.get('a');
        min = Math.min(min, map.get('b'));
        min = Math.min(min, map.get('c'));
        return min;
    }
}

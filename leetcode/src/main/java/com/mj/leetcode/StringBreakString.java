package com.mj.leetcode;

import java.util.Arrays;

public class StringBreakString {

    public boolean checkIfCanBreak(String s1, String s2) {

        char[] s1Array = s1.toCharArray();
        Arrays.sort(s1Array);
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s2Array);

        boolean s1breaks2 = false ;
        boolean s2breaks1 = false;

        if (s1Array[0] >= s2Array[0]) {
            s1breaks2 = true;
        }

        if (s2Array[0] >= s1Array[0]) {
            s2breaks1 = true;
        }


        for (int i = 1 ; i < s1Array.length; i++) {
            if (s1breaks2) {
                if (s1Array[i] > s2Array[i]) {
                    s2breaks1 = false;
                    continue;
                } else if (s1Array[i] == s2Array[i]) {
                    continue;
                } else {
                    s1breaks2 = false ;
                }
            }

            if (s2breaks1) {
                if (s2Array[i] > s1Array[i]) {
                    s1breaks2 = false;
                    continue;
                } else if (s1Array[i] == s2Array[i]) {
                    continue;
                } else {
                    s2breaks1 = false ;
                }
            }

            if (!s1breaks2 && !s1breaks2) {
                return false;
            }
        }


        return true;
    }
}

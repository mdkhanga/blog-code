package com.mj.leetcode;

public class RepeatedSubstring {

    // Leetcode 459
    public boolean repeatedSubstringPattern(String s) {

        int size = s.length() ;

        int mid = size/2 - 1 ;

        for (int i = 0 ; i <= mid; i++) {
            if(_repeated(s,i, size)) {
                return true;
            }
        }

        return false ;

    }

    private boolean _repeated(String s, int end, int size) {
        int first = 0 ;
        int i = 0;

        while(i < size && first <= end) {

            if (s.charAt(i) == s.charAt(first) ) {
                first = first == end ?  0 : first+1 ;
            } else {
                return false ;
            }

            i++ ;
        }

        if (first == 0) {
            return true;
        } else {
            return false;
        }
    }
}

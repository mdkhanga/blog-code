package com.mj.leetcode;

// leetcode 115
public class DistinctSubsequences {

    int sLen ;
    int tLen ;
    public int numDistinct(String s, String t) {

        sLen = s.length();
        tLen = t.length();

        return _numDistinct(s, 0, t, 0) ;
    }

    public int _numDistinct(String s, int sIndex,  String t, int tIndex) {

        if (tIndex == tLen) {
            return 1;
        } else if (sIndex == sLen && tIndex < tLen) {
            return 0;
        }

        // not equal
        if (s.charAt(sIndex) != t.charAt(tIndex)) {
            return _numDistinct(s, sIndex+1, t, tIndex);
        }

        // equal
        // pick char in s or don'nt pick it
        return _numDistinct(s, sIndex+1, t, tIndex+1) +
                _numDistinct(s, sIndex+1, t, tIndex);

    }
}

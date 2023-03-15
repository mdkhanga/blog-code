package com.mj.leetcode;

// leetcode 115
public class DistinctSubsequences {

    int sLen ;
    int tLen ;

    int dp[][] ; // i,j where i = start index in s, j = start inject in t
    public int numDistinct(String s, String t) {

        sLen = s.length();
        tLen = t.length();

        dp = new int[sLen][tLen];

         _numDistinct(s, 0, t, 0) ;

         return dp[0][0];
    }

    public void _numDistinct(String s, int sIndex,  String t, int tIndex) {

        if (s.charAt(sIndex) == t.charAt(tIndex))
            sss

        if (tIndex == tLen) {
            dp[sIndex-1][tIndex-1] = 1;
            return ;
        } else if (sIndex == sLen && tIndex < tLen) {
            dp[sIndex-1][tIndex-1] = -1;
            return ;
        }

        // not equal
        if (s.charAt(sIndex) != t.charAt(tIndex)) {
            // return _numDistinct(s, sIndex+1, t, tIndex);

            if (dp[sIndex+1][tIndex] == 0) {
                _numDistinct(s,sIndex+1, t, tIndex);
            }

            if (dp[sIndex+1][tIndex] > 0) {
                dp[sIndex][tIndex] = dp[sIndex+1][tIndex];
            } else if (dp[sIndex+1][tIndex] < 0) {
                dp[sIndex][tIndex] = 0;
            }
            return ;
        }

        // equal
        // pick char in s or don'nt pick it
        // return _numDistinct(s, sIndex+1, t, tIndex+1) +
        //         _numDistinct(s, sIndex+1, t, tIndex);

        int choice1 =0 , choice2 = 0;

        if (dp[sIndex+1][tIndex+1] == 0) {
            _numDistinct(s, sIndex+1, t, tIndex+1);
        }

        if (dp[sIndex+1][tIndex+1] > 0) {
            choice1 = dp[sIndex+1][tIndex+1];
        }

        if (dp[sIndex+1][tIndex] < 0) {
            _numDistinct(s, sIndex+1, t, tIndex);
        }

        if (dp[sIndex+1][tIndex] > 0) {
            choice2 = dp[sIndex+1][tIndex];
        }

        dp[sIndex][tIndex] = choice1 + choice2;


    }
}

package com.mj.leetcode;

public class RegularExp {
    public boolean isMatch(String s, String p) {

        char[] sArray = s.toCharArray() ;
        char[] pArray = p.toCharArray() ;

        int sIndex = 0 ;
        int pIndex = 0 ;

        while(sIndex < sArray.length && pIndex < pArray.length) {
            if (sArray[sIndex] == pArray[pIndex]) {
                sIndex++;
                pIndex++;
                continue;
            }
             else if (pArray[pIndex] == '.') {
                sIndex++;
                pIndex++;
                continue;
            } else if (pArray[pIndex] == '*') {
                char prevR = pArray[pIndex-1] ;
                char nextR = '+';
                if (pIndex < pArray.length - 1) {
                    nextR = pArray[pIndex+1];
                }
                if (prevR != '.') {
                    while ( sIndex < sArray.length && sArray[sIndex] == prevR) {
                        sIndex++;
                        if (sArray[sIndex] == nextR) {
                            break;
                        }
                    }
                    pIndex++;
                    continue;
                } else {
                    while ( sIndex < sArray.length ) {
                        sIndex++;
                    }
                    pIndex++;
                    continue;
                }
            } else if (sArray[sIndex] != pArray[pIndex]) {
                pIndex++;
                continue;
            } else {
                return false;
            }

        }

        if (sIndex != sArray.length || pIndex != pArray.length) {
            return false;
        }

        return true ;
    }
}

package com.mj.leetcode;

public class MinAdditionsToMakeString {

    public int addMinimum(String word) {

        int count = 0 ;

        char prev = word.charAt(0);

        if (prev == 'b') {
            count++;
        }

        if (prev == 'c') {
            count = count + 2;
        }
        char curr, next ;
        for (int i = 1 ; i < word.length()  ; i++) {

            curr = word.charAt(i) ;

            if (curr == 'a') {
                if (prev == 'a') {
                    count = count + 2 ;
                }
                if (prev == 'b') {
                    count++;
                }
            }

            if (curr == 'b') {
                if (prev == 'b') {
                    count = count + 2 ;
                }
                if (prev == 'c') {
                    count++;
                }
            }

            if (curr == 'c') {
                if (prev == 'c') {
                    count = count + 2;
                }
                if (prev == 'a') {
                    count++;
                }
            }

            prev = curr ;
        }

        char last = word.charAt(word.length()-1) ;

        if (last == 'b') {
            count++;
        }

        if (last == 'a') {
            count = count + 2;
        }

        return count ;

    }


}

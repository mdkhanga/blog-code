package com.mj.leetcode;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        int size = s.length() ;

        int start =  0;
        int end = size -1;

        while (start <= end) {

            char st = s.charAt(start);
            while (start <= end) {

                st = s.charAt(start);
                if (!Character.isLetterOrDigit(st)) {
                    start++;
                    continue ;
                } else {
                    st = Character.toLowerCase(st);
                    break;
                }

            }

            char e =s.charAt(end);
            while (start <= end) {

                e = s.charAt(end);
                if (!Character.isLetterOrDigit(e)) {
                    end--;
                    continue ;
                } else {
                    e = Character.toLowerCase(e);
                    break;
                }

            }

            if (st != e) {
                return false ;
            }

            start++;
            end--;
        }
        return true;

    }
}

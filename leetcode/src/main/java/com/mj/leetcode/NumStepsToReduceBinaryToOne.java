package com.mj.leetcode;

import java.util.ArrayList;

public class NumStepsToReduceBinaryToOne {

    public int numSteps(String s) {

        int count = 0 ;
        int msb = 0 ;
        ArrayList<Character> arrayList = new ArrayList<>();

        for (int i = 0 ; i < s.length(); i++) {
            arrayList.add(s.charAt(i));
        }

        int lsb = arrayList.size() - 1;

        while(lsb != 0) {
            if (arrayList.get(lsb) == '0') {
                // right shift
                lsb--;
                count++;
                continue;
            }
            // add 1
            char carry = '1' ;
            int curr = lsb;

            while (carry == '1' && curr >=0 ) {
                if (arrayList.get(curr) == '1') {
                    arrayList.set(curr,'0');
                }
                else if (arrayList.get(curr) == '0') {
                    arrayList.set(curr,'1');
                    carry = '0';
                    break;
                }
                curr--;
            }

            if (carry == '1' && curr < 0) {
                arrayList.add(0,'1');
                lsb++;
            }
            count++;
        }

        return count ;
    }


}

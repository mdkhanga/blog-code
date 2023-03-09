package com.mj.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SwapLongestRepeatingChar {

    Map<Character, List<Integer>> positonMap = new HashMap<>();
    public int maxRepOpt1(String text) {

        char[] txtArray = text.toCharArray() ;
        int len = txtArray.length ;

        for (int i = 0 ; i < len ; i++) {

            char c = text.charAt(i) ;
            List<Integer> positions = positonMap.get(c) ;
            if (positions == null) {
                positions = new ArrayList<>() ;
                positonMap.put(c,positions) ;
            }
            positions.add(i);
        }

        int max = 0 ;

        for (Character c : positonMap.keySet()) {
            List<Integer> v = positonMap.get(c) ;

            if (v.size() == 1) {
                max = Math.max(max, Math.min(2, len));
            }

            int start = 0 ;
            int end = 1 ;

            int currmax = 0;
            int curr = 1;
            boolean swap = false ;
            while (end < v.size()) {
                int diff = v.get(end) - v.get(end-1);
                if (diff == 1) {
                    curr++;
                }


            }


        }

        return max ;

    }
}

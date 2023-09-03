package com.mj.leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ReorganizeString {

    // Leetcode 767
    public String reorganizeString(String s) {

        int size = s.length();
        StringBuilder b = new StringBuilder();
        Map<Character, Integer> charCountMap = new HashMap<>() ;

        for (int i =0 ; i < size; i++) {

            char c = s.charAt(i);

            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c)+1);
            } else {
                charCountMap.put(c,1);
            }

        }

        int count = 0 ;
        boolean success = true;

        while(count <= size) {

            Iterator<Map.Entry<Character,Integer>> iter = charCountMap.entrySet().iterator() ;

            while(iter.hasNext()) {

                Map.Entry<Character, Integer> e = iter.next() ;
                if (count > 0 && e.getValue() == b.charAt(count-1)) {
                    success = false ;
                    break;
                }
                b.append(e.getKey());
                count++;
                if (e.getValue() == 1) {
                    iter.remove();
                } else {
                    e.setValue(e.getValue()-1);
                }

            }

        }

        if (success) {
            return b.toString();
        } else {
            return "";
        }
    }
}

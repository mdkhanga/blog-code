package com.mj.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Leetcode 1477
public class NonOverlappingSubArrays {

    public int minSumOfLengths(int[] arr, int target) {

        int min1 =Integer.MAX_VALUE  , min2 = Integer.MAX_VALUE;

        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        List<Range> ranges = new ArrayList<>();

        prefixSumMap.put(0,-1);

        int size = arr.length;

        int prefixSum = 0 ;
        for (int i = 0 ; i < size ; i++) {
            prefixSum = prefixSum + arr[i];
            int required = prefixSum - target ;
            int endIndex = prefixSumMap.getOrDefault(required, -1) ;
            int asize = 0;

            if(required == 0) {
                min1 = 1;
                ranges.add(new Range(-1,0));
                continue;
            }

            if (endIndex >= 0) {
                ranges.add(new Range(endIndex, i));
            }

            prefixSumMap.put(prefixSum, i) ;

        }

        if (ranges.size() < 2) {
            return -1;
        }


        return findMin(ranges, 0, 0 , null, 0);

    }

    private int findMin(List<Range> ranges , int sumSoFar, int index, Range prev, int numPicked) {
        int ret1 = 0 , ret2 = 0;

        if (index >= ranges.size() && numPicked == 2 ) {
            return sumSoFar;
        } else if (index >= ranges.size()) {
            return -1;
        }

        // include
        if (index == 0 || notOverlap(prev, ranges.get(index))) {

            Range r = ranges.get(index);
            ret1 = findMin(ranges, sumSoFar + r.end - r.startminus1, index+1, r , numPicked+1);
        }

        // not include

        ret2 = findMin(ranges, sumSoFar , index+1, prev , numPicked);


        if (ret1 > 0 && ret2 > 0) {
            return Math.min(ret1, ret2);
        } else if (ret1 > 0) {
            return ret1;
        } else {
            return ret2;
        }
    }

    private static class Range {

        int startminus1 ;
        int end ;

        Range(int a , int b) {
            startminus1 = a;
            end = b;
        }

    }

    private boolean notOverlap(Range r1 , Range r2) {

        if (r1 == null || r2 == null) {
            return true;
        }

        if (r2.startminus1 + 1 <= r1.end) {
            return false ;
        }

        return true;
    }

    public void writeText(String t) {
        t = "Hello world" ;
        System.out.println(t);
    }
}

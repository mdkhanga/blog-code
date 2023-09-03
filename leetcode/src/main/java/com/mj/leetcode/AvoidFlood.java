package com.mj.leetcode;

import java.util.*;

// Leetcode 1488
public class AvoidFlood {

    public int[] avoidFlood(int[] rains) {

        int size = rains.length;

        int[] ret = new int[size] ;

        Deque<Integer> drydays = new ArrayDeque<>();
        Map<Integer, Integer> fullLaKes = new HashMap<>();

        for (int i = 0 ; i < size ; i++) {

            if (rains[i] > 0) {

                if (fullLaKes.containsKey(rains[i])) {
                    if (drydays.isEmpty()) {
                        return new int[0];
                    } else {
                        // int prevDryDay = drydays.pollFirst();
                        int prevFullDay = fullLaKes.get(rains[i]) ;

                        Iterator<Integer> drydaysIterator = drydays.iterator();
                        boolean emptied = false;
                        while(drydaysIterator.hasNext()) {
                            int prevDryDay = drydaysIterator.next();
                            if (prevDryDay > prevFullDay) {
                                ret[prevDryDay] = rains[i];
                                drydaysIterator.remove();
                                emptied = true;
                                break;
                            }
                        }

                       if (!emptied){
                            return new int[0];
                        }
                    }
                }
                ret[i] = -1;
                fullLaKes.put(rains[i],i);

            } else {

                drydays.addLast(i);

            }
        }

        while(!drydays.isEmpty()) {
            ret[drydays.pollFirst()] = 1;
        }

        return ret ;
    }
}

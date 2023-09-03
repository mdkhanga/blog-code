package com.mj.leetcode;

public class MinimumPenaltyShop {

    public int bestClosingTime(String customers) {

        int min = Integer.MAX_VALUE ;
        int minhr = -1;
        int size = customers.length();
        int y[] = new int[size+1];
        int n[] = new int[size+1];

        y[0] = 0;
        n[0] = 0;

        for (int i = 1 ; i <= size; i++) {
            if (customers.charAt(i-1) == 'Y') {
                y[i] = y[i-1]+1;
                n[i] = n[i-1];
            } else {
                y[i] = y[i-1];
                n[i] = n[i-1] + 1;
            }
        }


        for (int i = 0 ; i <= size ;i++) {
            int cost = y[size] - y[i] + n[i] - n[0];

            if (cost < min) {
                min = cost ;
                minhr = i;
            }
        }

        return minhr ;

    }

}

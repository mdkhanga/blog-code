package com.mj.leetcode;

// Leetcode 74
public class Search2dMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix[0].length ;
        int n = matrix.length;

        int startr = 0; int startc = 0;
        int endr = n-1; int endc = m-1;

        while ( startr <= endr && startc <= endc) {

            int midr = (startr + endr)/2 ;
            int midc = (startc + endc)/2 ;

            if (matrix[midr][midc] == target) {
                return true;
                // } else if (startr == midr) {
            } else if (startr == endr) {
                if (matrix[midr][midc] > target) {
                    endc = midc - 1;
                } else {
                    startc = midc + 1;
                }
            // } else if (startc == midc) {
            } else if (startc == endc) {
                if (matrix[midr][midc] > target) {
                    endr = midr-1;
                } else {
                    startr = midr+1;
                }

            } else if (matrix[midr][midc] > target) {

                if (matrix[midr][startc] > target) {
                    endr = midr-1;
                    endc = m-1 ;
                } else {
                    endr = midr;
                    endc = midc;
                }

            } else {

                // matrix[midr][midc] < target
                if (matrix[midr][endc] < target) {
                    startr = midr+1 ;
                    startc = 0 ;
                } else {
                    startr = midr;
                    startc = midc;
                    endr = midr;
                }

            }

        }

        return false ;
    }
}

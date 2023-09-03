package com.mj.leetcode;

import java.util.ArrayList;
import java.util.List;

// Leetcode 77
public class Combinations {

    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> ret = new ArrayList<>();

        _combine(1, n, k, null, ret);

        return ret;
    }

    private void _combine(int curr, int n, int k, List<Integer> l, List<List<Integer>> result) {

        if (l != null && l.size() == k) {
            result.add(l);
            return ;
        }

        if (l!= null && l.size() + n - curr + 1 < k) {
            return ;
        }

        List<Integer> copy = new ArrayList<>();
        if ( l == null) {
            l = new ArrayList<>();
            copy = new ArrayList<>();
        } else {
            for (int i : l) {
                copy.add(i);
            }
        }

        // include curr
        l.add(curr);
        _combine(curr+1,n,k,l,result);

        // not include
        _combine(curr+1,n,k,copy,result);


    }
}

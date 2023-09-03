package com.mj.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Leetcode 1494
public class ParallelCourses2 {

    public int minNumberOfSemesters(int n, int[][] relations, int k) {

        int semesters = 0 ;

        List<Integer> adj[] = new ArrayList[n+1];
        int[] indegree = new int[n+1];

        for (int i = 1 ; i <= n ; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0 ; i < relations.length ; i++) {
            adj[relations[i][0]].add(relations[i][1]);
            indegree[relations[i][1]]++;
            // reverse graph
            /* adj[relations[i][1]].add(relations[i][0]);
            indegree[relations[i][0]]++;*/

        }

        Queue<Integer> zeroDegreeQ = new LinkedList<>() ;

        for (int i = 1 ; i <= n ; i++) {
            if (indegree[i] == 0) {
                zeroDegreeQ.add(i) ;
            }
        }
        zeroDegreeQ.add(-1) ; // marker

        int count = 0 ;
        while (!(zeroDegreeQ.peek() == -1 && zeroDegreeQ.size()  == 1)) {

            int c = zeroDegreeQ.poll() ;
            if (c == -1) {

                if (count != 0) {
                    // semesters++;
                    count = 0;
                }
                zeroDegreeQ.add(-1);
                continue;
            }
            count++ ;
            if (count == 1) {
                semesters++;
            }

            if (count == k) {
                count = 0;
            }

            for (int i : adj[c]) {
                indegree[i]--;

                if (indegree[i] == 0) {
                    zeroDegreeQ.add(i);
                }
            }

        }

        return semesters ;

    }
}

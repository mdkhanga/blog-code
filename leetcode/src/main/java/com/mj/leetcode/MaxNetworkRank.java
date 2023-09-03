package com.mj.leetcode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

// Leetcode 1615
public class MaxNetworkRank {

    public int maximalNetworkRank(int n, int[][] roads) {

        int[] connected = new int[n];
        Set<Edge> edges = new HashSet<Edge>();

        for (int i = 0 ; i < roads.length ; i++) {
            connected[roads[i][0]]++;
            connected[roads[i][1]]++;
            edges.add(new Edge(roads[i][0],roads[i][1]));
        }

        int max1 = connected[0] >= connected[1] ? 0 : 1 ;
        int max2 = connected[0] >= connected[1] ? 1 : 0 ;

        int max = 0;
        for (int i = 0 ; i < n-1 ; i++) {
            for (int j = i+1 ; j < n ; j++) {
                int rank = 0 ;

                if (edges.contains(new Edge(i,j)) || edges.contains(new Edge(j,i))) {
                    rank = connected[i] + connected[j] - 1;
                } else {
                    rank = connected[i] + connected[j];
                }

                max = Math.max(max,rank);
            }
        }

        /* for (int i = 2 ; i < n ; i++) {

            if (connected[i] >= connected[max1] ) {
                max2 = max1;
                max1 = i ;
            } else if (connected[i] >= connected[max2]) {
                max2 = i ;
            }
        }

        if (edges.contains(new Edge(max1, max2)) || edges.contains(new Edge(max2, max1)))
         return connected[max1] + connected[max2] - 1;
        else
            return connected[max1] + connected[max2] ; */

        return max ;

    }

    private static class Edge {
        int i ;
        int j ;

        public Edge(int a, int b) {
            i = a ;
            j = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Edge edge = (Edge) o;
            return i == edge.i && j == edge.j;
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, j);
        }
    }
}

package com.mj.leetcode;

import java.util.HashSet;
import java.util.Set;

// Leetcode 1496
public class PathCrossing {



    public boolean isPathCrossing(String path) {

        Set<Pair> points = new HashSet<>();

        int currx = 0 ;
        int curry = 0 ;
        points.add(new Pair(currx,curry));
        for (char c : path.toCharArray()) {

            if ( c == 'N') {
                curry++;
            } else if (c == 'E') {
                currx++;
            } else if (c == 'W') {
                currx--;
            } else {
                curry--;
            }

            Pair p = new Pair(currx, curry);
            if (points.contains(p)) {
                return true ;
            } else {
                points.add(p);
            }

        }

        return false;
    }

    public static class Pair {
        int x ;
        int y ;
        public Pair(int x, int y) {
            this.x  = x;
            this.y = y ;
        }
    }

}

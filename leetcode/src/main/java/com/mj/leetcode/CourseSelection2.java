package com.mj.leetcode;

import java.util.*;

// Leetcode 210
public class CourseSelection2 {

    Map<Integer, Set<Integer>> graph = new HashMap<>();

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        int[] ret = new int[numCourses];
        int curr = 0;

        for (int i = 0 ; i < numCourses ; i++) {
            graph.put(i, new HashSet<Integer>());
        }


        for (int i = 0 ; i < prerequisites.length ; i++) {
            Set<Integer> d
                 = graph.get(prerequisites[i][0]);

            d.add(prerequisites[i][1]);
            graph.put(prerequisites[i][0], d);
        }

        int numCoursesCanComplete = 0 ;

        while (true) {

            Set<Integer> keys = graph.keySet() ;
            int numNoSuccessors = 0 ;

            List<Integer> keystoremove = new ArrayList<>();
            for (int key : keys) {
                if (graph.get(key).size() == 0) {
                    // thie course has no successors and can be completed
                    keystoremove.add(key);
                    ret[curr] = key;
                    curr++;
                    numNoSuccessors++;
                    numCoursesCanComplete++;
                    updateGraph(key) ;
                }
            }

            for(int key : keystoremove) {
                graph.remove(key);
            }

            if (numNoSuccessors == 0) {
                break;
            }
        }

        if (numCourses != numCoursesCanComplete){
            return new int[1];
        } else {
            return ret;
        }
    }

    private void updateGraph(int key) {
        for (Set<Integer> n: graph.values()) {
            n.remove(key);
        }
    }
}

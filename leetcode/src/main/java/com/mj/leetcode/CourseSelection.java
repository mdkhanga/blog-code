package com.mj.leetcode;

import java.util.*;

// Leetcode 207
public class CourseSelection {

    Map<Integer, Set<Integer>> graph = new HashMap<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {

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

        return (numCourses == numCoursesCanComplete);
    }

    private void updateGraph(int key) {
        for (Set<Integer> n: graph.values()) {
            n.remove(key);
        }
    }
}

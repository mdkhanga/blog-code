package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParallelCourses2Test {

    ParallelCourses2 p = new ParallelCourses2() ;

    @Test
    public void test1() {

        int[][] relations = {{2,1},{3,1},{1,4}} ;

        int ret = p.minNumberOfSemesters(4, relations, 2);

        assertEquals(3, ret);

    }

    @Test
    public void test2() {

        int[][] relations = {{12,8},{2,4},{3,7},{6,8},{11,8},{9,4},{9,7},{12,4},{11,4},{6,4},{1,4},{10,7},{10,4},{1,7},{1,8},
                {2,7},{8,4},{10,8},{12,7},{5,4},{3,4},{11,7},{7,4},{13,4},{9,8},{13,8}} ;

        int ret = p.minNumberOfSemesters(13, relations, 9);

        assertEquals(3, ret);

    }

    @Test
    public void test3() {

        int[][] relations = {{2,1},{2,4}} ;

        int ret = p.minNumberOfSemesters(4, relations, 2);

        assertEquals(3, ret);

    }

}
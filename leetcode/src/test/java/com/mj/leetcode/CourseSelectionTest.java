package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseSelectionTest {

    CourseSelection c = new CourseSelection();

    @Test
    public void test1() {

        int[][] p = {{1,0}} ;

        boolean ret = c.canFinish(2, p);

        assertEquals(true,ret);

    }

}
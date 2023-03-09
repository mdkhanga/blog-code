package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualSubStringsInBudgetTest {

    EqualSubStringsInBudget eq = new EqualSubStringsInBudget();

    @Test
    public void test1() {

        int res = eq.equalSubstring("abcd","bcdf",3) ;

        assertEquals(3, res);

    }

    @Test
    public void test2() {

        int res = eq.equalSubstring("abcd","cdef",3) ;

        assertEquals(1, res);

    }

    @Test
    public void test3() {

        int res = eq.equalSubstring("abcd","acde",0) ;

        assertEquals(1, res);

    }
}
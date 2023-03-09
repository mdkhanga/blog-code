package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveAllAdjacentDuplicates2Test {

    RemoveAllAdjacentDuplicates2 r2 = new RemoveAllAdjacentDuplicates2();

    @Test
    public void test1() {
        String ret = r2.removeDuplicates("abcd",2);
        assertEquals("abcd",ret);
    }

    @Test
    public void test2() {
        String ret = r2.removeDuplicates("deeedbbcccbdaa",3);
        assertEquals("aa",ret);
    }

    @Test
    public void test3() {
        String ret = r2.removeDuplicates("pbbcggttciiippooaais",2);
        assertEquals("ps",ret);
    }

    @Test
    public void test4() {
        String s = "wilddddddddddgooowwwwwwwwwwoooossssssssssoccccccchhhhhhhhhhcccccccccccccooryyyyyyyffffffffffyyynaicv" ;
        String ret = r2.removeDuplicates(s, 10);
        assertEquals("wilgrnaicv",ret);
    }
}
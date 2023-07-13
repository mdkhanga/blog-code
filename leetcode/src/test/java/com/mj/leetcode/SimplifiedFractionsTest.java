package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SimplifiedFractionsTest {

    SimplifiedFractions s = new SimplifiedFractions();

    @Test
    public void test1() {
        List<String> ret = s.simplifiedFractions(2);

        List<String> expected = Arrays.asList("1/2");
        assertEquals(expected,ret);
    }

    @Test
    public void test2() {
        List<String> ret = s.simplifiedFractions(3);

        List<String> expected = Arrays.asList("1/2","1/3","2/3");
        assertEquals(expected,ret);
    }

    @Test
    public void test3() {
        List<String> ret = s.simplifiedFractions(4);

        List<String> expected = Arrays.asList("1/2","1/3","1/4","2/3","3/4");
        // assertEquals(expected,ret);
    }

}
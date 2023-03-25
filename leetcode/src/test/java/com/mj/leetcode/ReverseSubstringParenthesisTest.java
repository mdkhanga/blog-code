package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseSubstringParenthesisTest {

    ReverseSubstringParenthesis r = new ReverseSubstringParenthesis();

    @Test
    public void test1() {
        String res = r.reverseParentheses("(abcd)");
        assertEquals("dcba",res);
    }

    @Test
    public void test2() {
        String res = r.reverseParentheses("(u(love)i)");
        assertEquals("iloveu",res);
    }

    @Test
    public void test3() {
        String res = r.reverseParentheses("f(ul)ao(t(y)qbn)()sj");
        assertEquals("fluaonbqytsj",res);
    }

}
package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackqueuesTest {

    Stackqueues sq = new Stackqueues() ;

    @Test
    public void test1() {

        sq.push(1);
        sq.push(2);
        System.out.println(sq.top());
        int ret1 = sq.pop() ;
        System.out.println(ret1);
        int ret2 = sq.pop();
        System.out.println(ret2);

    }

    @Test
    public void test2() {

        sq.push(1);
        sq.push(2);
        sq.push(3);
        sq.push(4);
        sq.push(2);

        System.out.println(sq.top());
        int ret1 = sq.pop() ;
        System.out.println(ret1);
        int ret2 = sq.top();
        System.out.println(ret2);

    }

}
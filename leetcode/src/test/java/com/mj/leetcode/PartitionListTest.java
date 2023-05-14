package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartitionListTest {

    PartitionList list = new PartitionList();

    @Test
    public void test1() {

        int[] input = {1,4,3,2,5,2};
        PartitionList.ListNode node = arrayToList(input);
        PartitionList.ListNode n = list.partition(node, 3);
        int[] output = listToArray(n, input.length);
        System.out.println(output);

        int[] expected = {1,2,2,4,3,5};
        assertArrayEquals(expected, output);
    }

    @Test
    public void test2() {

        int[] input = {2,1};
        PartitionList.ListNode node = arrayToList(input);
        PartitionList.ListNode n = list.partition(node, 2);
        int[] output = listToArray(n, input.length);
        System.out.println(output);

        int[] expected = {1,2};
        assertArrayEquals(expected, output);
    }

    @Test
    public void test3() {

        int[] input = {4,3,2,5,2};
        PartitionList.ListNode node = arrayToList(input);
        PartitionList.ListNode n = list.partition(node, 3);
        int[] output = listToArray(n, input.length);
        System.out.println(output);

        int[] expected = {2,2,4,3,5};
        assertArrayEquals(expected, output);
    }


    @Test
    public void test4() {

        int[] input = {1,4,3,0,2,5,2};
        PartitionList.ListNode node = arrayToList(input);
        PartitionList.ListNode n = list.partition(node, 3);
        int[] output = listToArray(n, input.length);
        System.out.println(output);

        int[] expected = {1,0,2,2,4,3,5};
        assertArrayEquals(expected, output);
    }

    private PartitionList.ListNode arrayToList(int[] input) {

        PartitionList.ListNode head = new PartitionList.ListNode(input[0]);

        PartitionList.ListNode prev = head;
        for (int i = 1 ; i < input.length ; i++) {
            PartitionList.ListNode current = new PartitionList.ListNode(input[i]);
            prev.next = current ;
            prev = current;
        }

        return head ;
    }

    private int[] listToArray(PartitionList.ListNode node, int n) {
        int[] ret = new int[n];

        int i = 0 ;
        while (node != null) {
            ret[i] = node.val;
            i++;
            node = node.next;
        }

        return ret;
    }



}
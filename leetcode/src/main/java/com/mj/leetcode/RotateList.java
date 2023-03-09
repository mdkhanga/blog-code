package com.mj.leetcode;
// leetcode 61
public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null) {
            return head;
        }

        int count = 0 ;
        ListNode curr = head ;

        ListNode prev = null ;
        while(curr != null) {
            count++ ;
            prev = curr;
            curr = curr.next;
        }

        k = k % count;

        int l = count - k ;

        ListNode front = head ;

        while (l > 1) {
            front = front.next ;
            l--;
        }

        ListNode newFront = front.next;
        front.next = null ;
        prev.next = head ;

        return newFront ;

    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}

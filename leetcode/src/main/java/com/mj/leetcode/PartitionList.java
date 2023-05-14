package com.mj.leetcode;

public class PartitionList {

    public ListNode partition(ListNode head, int x) {

        ListNode headCopy = head ;

        ListNode prev = null ;
        ListNode curr = head ;

        while(curr != null) {

            ListNode origCurr = curr ;

            if (curr.val >= x) {
                prev = curr;
                curr = curr.next;
                continue;
            }

            ListNode bCurr = headCopy ;
            ListNode bPrev = null ;

            while (bCurr != null && curr != null && bCurr != curr) {

                if (bCurr.val >= x && bCurr.val > curr.val) {
                    // curr in less than bcurr
                    ListNode tmp = curr.next;
                    if (bPrev != null) {
                        bPrev.next = curr;
                    } else {
                        headCopy = curr;
                    }

                    curr.next = bCurr;

                    prev.next = tmp;
                    curr = tmp;
                    break ;

                }

                bPrev = bCurr;
                bCurr = bCurr.next;
                continue;

            }

            if (curr == origCurr) {
                curr = curr.next;
            }

        }


        return headCopy;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}

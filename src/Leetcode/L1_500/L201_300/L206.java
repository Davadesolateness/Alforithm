package Leetcode.L1_500.L201_300;

import Leetcode.L1_500.ListNode;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/24 10:56
 * @Version 1.0
 */
public class L206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}

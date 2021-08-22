package Leetcode.L1_500.L101_200;

import Leetcode.L1_500.ListNode;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/24 11:20
 * @Version 1.0
 */
public class L141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}

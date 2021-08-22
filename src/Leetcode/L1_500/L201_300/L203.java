package Leetcode.L1_500.L201_300;

import Leetcode.L1_500.ListNode;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/24 10:15
 * @Version 1.0
 */
public class L203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode head1=new ListNode(-1);
        head1.next=head;
        ListNode node = head1;
        while (node.next != null) {
            if (node.next.val == val) {
                node.next=node.next.next;
            }else{
                node=node.next;
            }

        }
        return head1.next;
    }
}

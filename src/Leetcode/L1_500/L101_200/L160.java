package Leetcode.L1_500.L101_200;

import Leetcode.L1_500.ListNode;
import sun.plugin2.message.MarkTaintedMessage;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/24 11:31
 * @Version 1.0
 */
public class L160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //链表a和链表b,链表a走完路程之后，指向链表b，b指向a头节点，相同的路程一定会相遇
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}

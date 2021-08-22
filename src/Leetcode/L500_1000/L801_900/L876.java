package Leetcode.L500_1000.L801_900;

import Leetcode.L1_500.ListNode;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/24 12:00
 * @Version 1.0
 */
public class L876 {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head.next,fast=head.next;
        //快慢指针，一个走一步，一个走两步，走两步的节点到尾节点了，那么慢的那个就到中间节点了
        //主要解决偶数情况下，如123456，快节点指向5，慢节点指向3，此时出循环
        //需要判断快捷点的下一个节点是否是空，如果是空的话，返回中间节点，如果不是，返回下一个节点
        while(fast.next!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if (fast.next!=null ){
            return slow.next;
        }else {
            return slow;
        }
    }
}

package Learn;

/**
 * @author dong
 * @version 1.0.0
 * @ClassName Test02.java
 * @Description TODO
 * @createTime 2021年08月17日 15:20:00
 */
public class Test02 {
    /**
     * 存在一个按升序排列的链表，给你这个链表的头节点 head ，
     * 请你删除链表中所有存在数字重复情况的节点，只保留原始链表中 没有重复出现 的数字
     */
    public Node test01(Node head) {
        if (head == null) {
            return head;
        }
        Node headTemp = head;
        while (headTemp != null) {
            // 从主节点使用指针01开始循环遍历
            Node headNext = head.next;
            // 记录指针02的前一个节点
            Node preNode = headNext;
            while (headNext != null) {
                if (headNext.value == headTemp.value) {
                    // 如果值相同，则跳过当前节点的引用
                    preNode.next = headNext.next;
                }
                preNode = headNext;
                headNext = headNext.next;
            }
        }
        return head;
    }
}

class Node {
    int value;
    Node next;
}

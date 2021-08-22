package goldCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/18 21:01
 * @Version 1.0
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class ListNodeMy {
    public boolean removeNode(ListNode pNode) {
        // write code here
        if (pNode.next == null) {
            return false;
        }
        pNode.val = pNode.next.val;
        pNode.next = pNode.next.next;

        return true;
    }

    public ListNode partition(ListNode pHead, int x) {
        // write code here.
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        ListNode p1Head = null, p1 = null;
        p1Head.next = p1;
        ListNode p2Head = null, p2 = null;
        p2Head.next = p2;
        while (pHead.next != null) {
            if (pHead.val < x) {
                p1.val = pHead.val;
                p1 = p1.next;
            } else {
                p2.val = p1Head.val;
                p2 = p2.next;
            }
        }
        pHead.val = p1.val;
        pHead.next = p1Head.next;
        p1.next = p2Head.next;
        return pHead;
    }

   /* public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        if(a==null){
            return b;
        }
        if (b==null){
            return a;
        }

        ListNode q =new ListNode(0);
        ListNode c = q;
        int flag=0;
        while (a!=null && b!=null){
            int x=a.val;
            int y = b.val;
            if(x+y+flag>=10){
                c.next=new ListNode((x+y+flag)%10);
                flag=1;
            }else {
                c.next=new ListNode(x+y+flag);
            }
            c=c.next;
            a=a.next;
            b=b.next;
        }
        while (a!=null){
            if(flag + a.val >=10){
                c.next=new ListNode((a.val+flag)%10);
                flag=1;
            }else {
                c.next=new ListNode(a.val+flag);
                flag=0;
            }
            c=c.next;
            a=a.next;
        }
        while(b!=null){
            if(flag+b.val>=10){
                c.next=new ListNode((b.val+flag)%10);
                flag=1;
            }else{
                c.next=new ListNode(b.val+flag);
                flag=0;
            }
            c=c.next;
            b=b.next;
        }
        if(flag==1) {
            c.next=new ListNode(1);
        }
        return q.next;
    }*/

    public boolean iPalindrome(ListNode pHead) {
        // write code here
        ListNode p = pHead;
        List list = new ArrayList();
        while (p != null) {
            list.add(p.val);
            p = p.next;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != list.get(list.size() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    //链表A+B
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        ListNode resultHead = new ListNode(-1);
        ListNode resultCurrent = resultHead;
        int addToNextDigit = 0;
        while (a != null || b != null || addToNextDigit != 0) {
            int aVal = a != null ? a.val : 0;
            int bVal = b != null ? b.val : 0;
            int sum = aVal + bVal + addToNextDigit;
            int nodeDigit = sum % 10;
            addToNextDigit = sum / 10;

            resultCurrent.next = new ListNode(nodeDigit);
            resultCurrent = resultCurrent.next;

            a = a != null ? a.next : null;
            b = b != null ? b.next : null;
        }
        return resultHead.next;
    }

    //判断链表是不是回文数组
    public boolean isPalindrome(ListNode pHead) {
        // write code here
        int arrry[] = {0};
        int i = 0;
        while (pHead != null) {
            arrry[i] = pHead.val;
            pHead = pHead.next;
            i++;
        }
        for (int j = 0; j<=i;j++){
            if(arrry[j] == arrry[i]){
                i--;
            }else {
                return false;
            }
        }
        return true;
    }

    //栈满
    public ArrayList<ArrayList<Integer>> setOfStacks(int[][] ope, int size) {
        // write code here
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp = new ArrayList<>();
        ret.add(tmp);
        for (int i =0;i<ope.length;i++){
            if(ope[i][0] == 1){
                if(tmp.size()!=size){
                    tmp.add(ope[i][1]);
                }else{
                    tmp=new ArrayList<Integer>();
                    tmp.add(ope[i][1]);
                    ret.add(tmp);
                }
            }else {
                if(tmp.size()!=0){
                    tmp.remove(tmp.size() -1);
                }else {
                    ret.remove(ret.size() -1);
                    tmp = ret.get(ret.size() -1);
                    tmp.remove(tmp.size()-1);
                }
            }
        }
        return ret;
    }


    public static void main(String[] args) {

    }
}

package Leetcode.L1_500.L201_300;

import Leetcode.L1_500.ListNode;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/24 9:09
 * @Version 1.0
 */
public class L234 {
    public boolean isPalindrome(ListNode head) {
        //遍历链表变成数组，在根据数组判断
        int arr[] = new int[100];
        ListNode target = head;
        int i=0,j=0;
        while (target.next != null) {
            arr[i] = target.next.val;
            target=target.next;
            i++;
        }
        while (j<=i){
            if (arr[j]==arr[i-1]){
                j++;
                i--;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[]={1,2};
        L234 l = new L234();
        int j=0,i=2;

        while (j<=i){
            if (arr[j]==arr[i-1]){
                j++;
                i--;
            }else {
                System.out.println(0);
                break;
            }
        }
    }
}

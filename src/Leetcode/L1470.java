package Leetcode;

import javax.swing.plaf.ProgressBarUI;

public class L1470 {

    public static void main(String[] args) {
        L1470 test = new L1470();
        int[] a = {1,1,2,2};
        int[] b = test.shuffle(a, 2);
        for (int i = 0; i < b.length; i++) {
            System.out.println("第" + i + "个数的值为: " + b[i]);
        }
    }

    /**
     * 1 <= n <= 500
     * nums.length == 2n
     * 1 <= nums[i] <= 10^3
     *
     * @param nums
     * @param n
     * @return
     */
    public int[] shuffle(int[] nums, int n) {

        int[] sortArray = new int[nums.length];
        int length = nums.length;
        int left = 0;
        int right = n;
        // 标志位，true左边加入，false右边加入
        boolean flag = true;
        // 使用双指针进行排序
        for (int i = 0; i < length; i++) {
            if (flag) {
                sortArray[i] = nums[left];
                left++;
                flag = false;
            } else {
                sortArray[i] = nums[right];
                right++;
                flag = true;
            }
        }
        return sortArray;
    }
}

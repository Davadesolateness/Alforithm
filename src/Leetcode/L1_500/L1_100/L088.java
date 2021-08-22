package Leetcode.L1_500.L1_100;

import java.util.Arrays;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/22 11:39
 * @Version 1.0
 */
public class L088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //双指针法：i指向nums1的m-1; j指向nums2的末尾
        int i = m - 1;
        int j = n - 1;
        int leng = nums1.length - 1;

        while ((i >= 0) && (j >= 0)) {
            //比较nums1和nums2的元素大小，进行赋值操作
            nums1[leng--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }

        //利用原有的API，考虑特殊情况
        System.arraycopy(nums2, 0, nums1, 0, j + 1);
    }
}

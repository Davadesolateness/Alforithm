package Leetcode.L500_1000.L501_600;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/8 11:09
 * @Version 1.0
 */
public class L581 {
    public int findUnsortedSubarray(int[] nums) {
        int length = nums.length;
        int max = nums[0];
        int min = nums[length - 1];
        int l=0,r=-1;
        for (int i = 0; i < length; i++) {
            if (max > nums[i]) {
                r = i;
            } else {
                max = nums[i];
            }
            if (min < nums[length - i - 1]) {
                l = length - i - 1;
            } else {
                min = nums[length - i - 1];
            }
        }
        return r-l+1;
    }
}

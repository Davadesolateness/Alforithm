package Leetcode.L500_1000.L701_800;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/12 18:38
 * @Version 1.0
 */
public class L724 {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int left = nums[0];
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        for (int i = 0; i < nums.length; ++i) {
            if (left == sum-left-nums[i]){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
}

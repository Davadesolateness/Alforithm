package Leetcode.L1_500.L1_100;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/22 13:21
 * @Version 1.0
 */
public class L026 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}

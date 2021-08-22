package Leetcode.L1_500.L401_500;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/22 10:57
 * @Version 1.0
 */
public class L485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums==null || nums.length==0){
            return 0;
        }
        int count=0;
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                count++;
            }else {
                max = Math.max(count,max);
                count=0;
            }
        }
        max = Math.max(count,max);
        return max;
    }
}

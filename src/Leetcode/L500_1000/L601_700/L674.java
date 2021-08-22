package Leetcode.L500_1000.L601_700;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/22 9:04
 * @Version 1.0
 */
public class L674 {
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int max = 0;
        int count = 1;
        for (int i = 0; i < nums.length-1; i++) {
            //找出长的连续递增数列，与max比较,需判断全是递增的数组
            if (nums[i+1]>nums[i]){
                count++;
            }else{
                max = Math.max(count,max);
                count=1;
            }
        }
        return max;
    }

    public static void main(String[] args) {


    }
}


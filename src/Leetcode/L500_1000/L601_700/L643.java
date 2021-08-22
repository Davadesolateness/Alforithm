package Leetcode.L500_1000.L601_700;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/12 19:12
 * @Version 1.0
 */
public class L643 {
    public static double findMaxAverage(int[] nums, int k) {
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length-k+1; i++) {
            if (max< avage(nums,k,i)){
                max=avage(nums,k,i);
            }
        }
        return max;
    }

    public static double avage(int[] nums, int k, int index) {
        double avg = 0;
        int i = 0;
        while (i < k) {
            avg += nums[index + i];
            i++;
        }
        avg = avg / k;
        return avg;
    }

    public static void main(String[] args) {
        int[] a = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(a,4));
    }
}

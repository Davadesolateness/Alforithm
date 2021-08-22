package Leetcode.L1_500.L101_200;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/24 15:14
 * @Version 1.0
 */
public class L136 {
    public int singleNumber(int[] nums) {
        int a=0;
        for (int i : nums) {
            a ^= i;
        }
        return a;
    }
}

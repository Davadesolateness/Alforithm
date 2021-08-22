package Leetcode.L1_500.L101_200;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/24 15:29
 * @Version 1.0
 */
public class L190 {
    public int reverseBits(int n) {
        int ans = 0;
        for (int bitsSize = 31; n != 0; n = n >>> 1, bitsSize--) {
            ans += (n & 1) << bitsSize;
        }
        return ans;
    }
}

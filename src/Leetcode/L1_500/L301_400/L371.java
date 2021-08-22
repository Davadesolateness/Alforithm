package Leetcode.L1_500.L301_400;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/24 14:53
 * @Version 1.0
 */
public class L371 {
    public int getSum(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        int lower;
        int carrier;
        while (true) {
            lower = a ^ b; //计算低位和高位
            carrier = a & b;
            if (carrier==0){
                break;
            }
            a = lower;
            b = carrier<<1;
        }
        return lower;
    }
}

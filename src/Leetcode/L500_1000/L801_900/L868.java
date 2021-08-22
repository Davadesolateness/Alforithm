package Leetcode.L500_1000.L801_900;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/29 15:01
 * @Version 1.0
 */
public class L868 {
    public int binaryGap(int N) {
        int count=1,count2=0, max=Integer.MIN_VALUE;
        boolean flag = false;
        while (N != 0 ){
            if ( (N&1) == 1){
                flag=true;
                max = Math.max(max,count);
                count2++;
                count=1;
            }else {
                if (flag){
                    count++;
                }
            }
            N = N >> 1;
        }
        if (count2==1 || count2 == 0){
            return 0;
        }else {
            return max;
        }
    }
}

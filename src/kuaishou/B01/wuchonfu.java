package kuaishou.B01;

import java.util.Arrays;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/12 16:30
 * @Version 1.0
 */
public class wuchonfu {
    /**
     * 返回无重复幂因子的 N进制完美数之和的所有幂因子
     *
     * @param R int整型
     * @param N int整型 N进制
     * @return int整型一维数组
     */
    public static int[] GetPowerFactor(int R, int N) {
        // write code here
        int sum = 0;
        int max = 0;
        int sum1 = 0;
        int i = 1;
        int[] arr = new int[10];
        int[] arr2 =new int[10];
        while (sum < R) {
            max++;
            arr[i] = max;
            i++;
            sum = (int) (sum + Math.pow(N, max));
        }
        sum = 0;
        i=0;
        for (int j = max; j > 0; j--) {
            sum = (int) (sum + Math.pow(N, arr[j]));
            if (sum > R){
                sum = (int) (sum - Math.pow(N, arr[j]));
                j--;
            }
            arr2[i]=j;
            i++;
        }


        return arr2;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(GetPowerFactor(39, 3)));
    }

}

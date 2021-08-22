package Leetcode.L500_1000.L901_1000;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/12 17:57
 * @Version 1.0
 */
public class L941 {
    public static boolean validMountainArray(int[] A) {
        int max = 0;

        boolean flag = true;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) {
                max = A[i];
            } else if (A[i] == A[i + 1]) {
                flag = false;
            }
        }
        if (max == A[0]){
            flag=false;
        }
        return flag;
    }

    public static void main(String[] args) {

    }
}

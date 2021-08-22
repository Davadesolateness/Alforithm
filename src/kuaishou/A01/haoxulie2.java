package kuaishou.A01;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/12 8:38
 * @Version 1.0
 */
public class haoxulie2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        boolean result = false;
        int j = 0;
        int num = 0;
        int cc = 0;
        int[] ll = new int[m];
        while (sc.hasNextInt()) {
            ll[j] = sc.nextInt();
            j++;
        }
        j = 0;
        int slow = 0;
        int fast = 0;
        while (j < m) {
            num = ll[j];
            slow = num;
            fast = num;
            do {
                slow = squareSum(slow);
                fast = squareSum(fast);
                fast = squareSum(fast);
            } while (fast != slow);
            if (fast == 1) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
            j++;

        }
    }

    public static int squareSum(int n) {
        int rr = 0;
        while (n > 0) {
            rr += Math.pow(n % 10, 2);
            n /= 10;
        }
        return rr;
    }
}
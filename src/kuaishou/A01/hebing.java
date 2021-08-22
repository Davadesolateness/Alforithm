package kuaishou.A01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/12 9:52
 * @Version 1.0
 */
public class hebing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr1 = sc.nextLine().split(" ");
        String[] arr2 = sc.nextLine().split(" ");
        hebing1(arr1, arr2);
    }

    private static void hebing1(String[] a1, String[] a2) {
        int j = 0;
        int count = 0;
        for (int i = 0; i < a1.length; i++) {
            if (count++ == 4) {
                System.out.print(a2[j] + " ");
                j++;
                   count = 1;
            }
            System.out.print(a1[i] + " ");
        }
        if (j <= a2.length) {
            for (int i = j; i < a2.length; i++) {
                System.out.print(a2[i] + " ");
            }
        }

    }
}

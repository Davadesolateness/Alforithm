package kuaishou.A02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/12 10:35
 * @Version 1.0
 */
public class A02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String a = sc.nextLine();
        String[] arr = a.split(" ");
        int sum = 0;
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = Integer.parseInt(arr[i]);
            sum += arr2[i];
        }
        Arrays.sort(arr2);
        int k = arr2.length - 1;
        int sumMax = 0;
        int target = sum / 2; //数值越接近总数的一半，两部分元素的和就越小
        int min = Integer.MAX_VALUE;
        int w = 0;
        while (k >= w) {

        }
        System.out.println(sumMax);
        System.out.println(Math.abs(sumMax));
    }
}

package kuaishou.A02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/12 11:32
 * @Version 1.0
 */
public class dengchashulioe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int maxLen=0;
        int newLne=2;
        int start=0;
        int d=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int k = i+1; k < arr.length-1; k++) {
                d=arr[k]-arr[i];
                for (int j = i+1; j < arr.length-1; j++) {
                    if (d == (arr[j+1]-arr[j])){
                        newLne++;
                        continue;
                    }else {
                        i=j-1;
                        break;
                    }
                }
                maxLen = Math.max(maxLen,newLne);//比较最大的长度数组
                newLne=2;
            }
        }
        System.out.println(maxLen);
    }
}

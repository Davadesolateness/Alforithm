package kuaishou.kuaishou2;

import sun.font.TrueTypeFont;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/26 16:20
 * @Version 1.0
 */
public class k01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] array = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        //由于题目要求，所以在边线的1均是没有被包围的1
        if (x <= 2 || y <= 2) {
            System.out.println(0);
        }
        //对于大于2的行列，进行计算
       /* int d = 0;
        if (x > y) {
            d = x - y;
        } else {
            d = y - x;
        }*/
        //将数组四周设为0
        for (int i = 0; i < x; i++) {
            array[i][0] = 0;
            array[i][y-1] = 0;
        }
        for (int i = 0; i < y; i++) {
            array[0][i] = 0;
            array[x-1][i] = 0;
        }
        boolean flag =false;
        int count = 0;
        for (int i = 1; i < x - 1; i++) {
            for (int j = 1; j < y - 1; j++) {
                if (check(array,i,j)) {
                    count++;
                }
            }
        }
        System.out.println(count);


    }

    public static boolean check(int a[][], int i, int j) {
        if (a[i - 1][j] == 1) {
            a[i - 1][j] = 0;
            return check(a,i-1,j);
        } else if (a[i + 1][j] == 1) {
            a[i + 1][j] = 0;
            return check(a, i + 1, j);
        } else if (a[i][j - 1] == 1) {
            a[i][j - 1] = 0;
            return check(a, i, j - 1);
        } else if (a[i][j + 1] == 1) {
            a[i][j + 1] = 0;
            return check(a, i,j+1);
        }else {
            return true;
        }
    }
}

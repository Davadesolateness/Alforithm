package Learn;

import java.util.Scanner;

/**
 * @author dong
 * @version 1.0.0
 * @ClassName Test04.java
 * @Description TODO
 * @createTime 2021年08月22日 15:21:00
 */
public class Test04 {

    /**
     * 假设有n个整数，现在请你写一段代码，求出这n个整数中有多少个不同的子集合 和为24
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int array[] = new int[a];
        for (int m = 0; m < a; m++) {
            array[m] = in.nextInt();
        }

        int count = 0;
        for (int i = 0; i < array.length  ; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                if(i == j){
                    continue;
                }
                if(array[i] + array[j] == 24){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}


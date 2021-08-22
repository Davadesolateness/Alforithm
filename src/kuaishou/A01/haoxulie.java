package kuaishou.A01;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/10 21:01
 * @Version 1.0
 */
public class haoxulie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入组数:");
        int a = sc.nextInt();
        int target[] = new int[a];
        System.out.println("请输入目标数字:");
        for (int i = 0; i < a; i++) {
            target[i] = sc.nextInt();
        }
        System.out.println("------------");
        int b = 0;
        int sum = 0;
        boolean flag = true;
        int count=0;
        for (int i = 0; i < a; i++) {
            b = target[i];
            while (flag) {
                count++;
                while (b != 0) {
                    sum = (int) (sum + Math.pow(b % 10, 2));
                    b=b/10;
                }
                if (count>20){
                    flag=false;
                    System.out.println("false");
                }
                if (sum == 1) {
                    flag = false;
                    System.out.println("true");
                } else {
                    b = sum;
                    sum = 0;
                }

            }
            sum=0;
            count=0;
            flag=true;
        }
    }
}

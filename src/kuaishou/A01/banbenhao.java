package kuaishou.A01;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/12 8:58
 * @Version 1.0
 */
public class banbenhao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());
        int y=0;
        String arr[] = new String[m];
            for (int i = 0; i < m; i++) {
                String[] ver = sc.nextLine().split(" ");
                String[] ver1 = ver[0].split("\\.");
                String[] ver2 = ver[1].split("\\.");

                int length1 = ver1.length;
                int length2 = ver2.length;
                int len = Math.max(length1,length2);

                int p=0;
                boolean eqFlag = false;
                boolean gtFlag = false;
                while (p < len){
                    int num1 = p>=length1 ? 0 : Integer.parseInt(ver1[p]);
                    int num2 = p>=length2 ? 0 : Integer.parseInt(ver2[p]);

                    if (num1 > num2){
                        System.out.println("false");
                        gtFlag = true;
                        break;
                    }else if (num1 == num2){
                        eqFlag=true;
                    }else {
                        eqFlag=false;
                        break;
                    }
                    p++;
                }
                if (gtFlag){
                    continue;
                }
                System.out.println(eqFlag ? "false" : "true");
            }

    }
}

package kuaishou.A02;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/12 13:18
 * @Version 1.0
 */
public class dizhi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String target = scanner.nextLine();
        boolean flag1=true;
        boolean flag2=true;
        if(target.contains(".")){
            String[] str= target.split("\\.");
            if (str.length!=4){
                flag1=false;
            }
            for (int i = 0; i < str.length; i++) {
                if (Integer.parseInt(str[i])<0 || Integer.parseInt(str[i])>255 || str[i].charAt(0)=='0'){
                    flag1=false;
                }
            }

            if (flag1){
                System.out.println("IPv4");
            }else {
                System.out.println("Neither");
            }
        }else if (target.contains(":")){
            String[] str= target.split(":");
            if (str.length!=8){
                flag2=false;
            }
            for (int i = 0; i < str.length; i++) {
                if (str[i].length()>4){
                    flag2=false;
                }
            }

            if (flag2){
                System.out.println("IPv6");
            }else {
                System.out.println("Neither");
            }
        }else {
            System.out.println("Neither");
        }
    }

}

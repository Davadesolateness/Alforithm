package Leetcode.L500_1000.L501_600;

import org.omg.PortableInterceptor.INACTIVE;

import java.net.Inet4Address;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/27 20:11
 * @Version 1.0
 */
public class L537 {
    public String complexNumberMultiply(String a, String b) {
        int num1, num2, ai, bi;
        String[] ca = a.split("\\+|i");
        String[] cb = b.split("\\+|i");
        num1 = Integer.parseInt(ca[0]);
        num2 = Integer.parseInt(cb[0]);
        ai = Integer.parseInt(ca[1]);
        bi = Integer.parseInt(cb[1]);
        return (num1 * num2 - ai * bi) + "+" + (num1 * bi + num2 * ai) + "i";
    }

    public static void main(String[] args) {
        L537 l = new L537();
        String a1= ",aa,bb,cc,dd,,,";
        String[] ca = a1.split(",");

        for (int i = 0; i < ca.length; i++) {
            System.out.println(ca[i]);
        }
        //System.out.println(ca.length);
    }
}

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] flags = new int[256];
        String str = "asdfasdf";
        int a = str.charAt(0);
        flags[str.charAt(0)]++;
        System.out.println(a);
        for (int i = 0; i < str.length(); i++) {
            System.out.println("第"+ i +"个字符是：" + str.charAt(i));
        }
    }
}

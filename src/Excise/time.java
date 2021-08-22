package Excise;

import java.util.HashMap;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/5/6 17:08
 * @Version 1.0
 */
public class time {
    public static void main(String[] args) {
        System.out.println("----------------start------------------");
        //使用int类型的话，差值是2，这个的话差值是二十倍左右
        Integer num = 100000;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 9999999; i++) {
            num += 20000;
        }
        long end = System.currentTimeMillis();
        System.out.println("时间差  >> :" + (end - start));
    }
}

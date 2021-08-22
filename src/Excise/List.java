package Excise;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/5/6 16:58
 * @Version 1.0
 */
public class List {
    public static void main(String[] args) {
        ArrayList<String>  list = new ArrayList(Arrays.asList("a","b","c","d"));
        System.out.println("before:" + list);
        // 在这个方法中有一个严重的错误。当一个元素被删除时，列表的大小缩小并且下标变化，
        // 所以当你想要在一个循环中用下标删除多个元素的时候，它并不会正常的生效。
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println("s :" + s);
            if ("a".equals(s)) {
                list.remove(s);
            }
            if ("b".equals(s)) {
                list.remove(s);
            }
        }
        System.out.println("after :" + list);
    }
}

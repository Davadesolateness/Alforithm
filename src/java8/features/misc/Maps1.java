package java8.features.misc;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dong
 * @version 1.0.0
 * @ClassName Maps1.java
 * @Description TODO
 * @createTime 2021年08月29日 09:42:00
 */
public class Maps1 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        for(int i = 0; i < 10; i++){
            map.putIfAbsent(i,"val" + i);
        }

        map.forEach((id,val) ->System.out.println(val));

        map.computeIfPresent(3,(num,val)->val+num);
        System.out.println(map.get(3));

        map.computeIfPresent(9,(num,val)->null);
        System.out.println(map.containsKey(9));

        map.computeIfAbsent(23,num->"val"+ num);
        System.out.println(map.containsKey(23));

        map.computeIfAbsent(3, num -> "bam");
        System.out.println(map.get(3));             // val33

        System.out.println(map.getOrDefault(42, "not found"));      // not found

        map.remove(3, "val3");
        System.out.println(map.get(3));             // val33

        map.remove(3, "val33");
        System.out.println(map.get(3));             // null

        map.merge(9, "val9", (value, newValue) -> value.concat(newValue));
        System.out.println(map.get(9));             // val9

        map.merge(9, "concat", (value, newValue) -> value.concat(newValue));
        System.out.println(map.get(9));             // val9concat
    }
}

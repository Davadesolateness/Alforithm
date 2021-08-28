package java8.features.lambda;

import java.util.*;

/**
 * @author dong
 * @version 1.0.0
 * @ClassName Lambda1.java
 * @Description TODO
 * @createTime 2021年08月25日 21:49:00
 */
public class Lambda1 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });

        Collections.sort(names, (a, b) -> b.compareTo(a));
        System.out.println(names);

        names.sort(Collections.reverseOrder());

        System.out.println(names);

        List<String> names2 = Arrays.asList("peter", null, "anna", "mike", "xenxa");
        names2.sort(Comparator.nullsFirst(String::compareTo));
        System.out.println(names2);
        List<String> names3 = null;
        Optional.ofNullable(names3).ifPresent(list -> list.sort(Comparator.naturalOrder()));
        System.out.println(names3);

    }
}

package java8.features.lambda;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.function.BiConsumer;

/**
 * @author dong
 * @version 1.0.0
 * @ClassName Lambda5.java
 * @Description TODO
 * @createTime 2021年08月28日 21:51:00
 */
public class Lambda5 {
    public static void main(String[] args) {
        BiConsumer<String,Integer> printkeyAndValue
                = (key,value)-> System.out.println(key+"-"+value);
        printkeyAndValue.accept("One",1);
        printkeyAndValue.accept("Two",2);

        System.out.println("###############");

        HashMap<String,Integer> dummyValues = new HashMap<>();
        dummyValues.put("one",1);
        dummyValues.put("Two",2);
        dummyValues.put("Three",3);

        dummyValues.forEach((key,value)-> System.out.println(key + "-" + value));
    }
}

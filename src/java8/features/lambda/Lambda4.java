package java8.features.lambda;

import javafx.scene.LightBase;

/**
 * @author dong
 * @version 1.0.0
 * @ClassName Lambda4.java
 * @Description TODO
 * @createTime 2021年08月28日 21:38:00
 */
public class Lambda4 {

    static int outerStaticNum;

    int outerNum;

    void testScopes() {
        int num = 1;
        Lambda2.Converter<Integer,String> stringConverter =
                (from) -> String.valueOf(from + num);

        String convert = stringConverter.convert(2);
        System.out.println(convert);

        Lambda2.Converter<Integer,String> stringConverter2 =
                (form)->{
            outerNum = 13;
            return String.valueOf(form);
                };

        String[] array = new String[1];
        Lambda2.Converter<Integer,String> stringConverter3 = (from) ->
        {
            array[0] = "Hi there";
            return String.valueOf(from);
        };
        stringConverter3.convert(23);

        System.out.println(array[0]);
    }

    public static void main(String[] args) {
        new Lambda4().testScopes();
    }
}

package java8.features.misc;

import java.lang.annotation.*;

/**
 * @author dong
 * @version 1.0.0
 * @ClassName Annotations1.java
 * @Description TODO
 * @createTime 2021年08月29日 08:08:00
 */
public class Annotations1 {

    @Target({ElementType.TYPE_PARAMETER,ElementType.TYPE_USE})
    @interface MyAnnotation{}

    @Retention(RetentionPolicy.RUNTIME)
    @interface Hints{
        Hint[] value();
    }

    @Repeatable(Hints.class)
    @Retention(RetentionPolicy.RUNTIME)
    @interface Hint{
        String value();
    }

    @Hint("hint1")
    @Hint("hint2")
    class Person{

    }

    public static void main(String[] args) {
        Hint hint = Person.class.getAnnotation(Hint.class);
        System.out.println(hint );

        Hints hints1 = Person.class.getAnnotation(Hints.class);
        System.out.println(hints1.value().length);

        Hint[] hints2 = Person.class.getAnnotationsByType(Hint.class);
        System.out.println(hints2.length);
    }
}

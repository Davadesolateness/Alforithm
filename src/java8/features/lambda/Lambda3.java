package java8.features.lambda;

import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author dong
 * @version 1.0.0
 * @ClassName Lambda3.java
 * @Description TODO
 * @createTime 2021年08月26日 21:13:00
 */
public class Lambda3 {

    @FunctionalInterface
    interface Fun {
        void foo();
    }

    public static void main(String[] args) {
        Predicate<String> predicate = (s) -> s.length() > 0;

        predicate.test("foo");
        predicate.negate().test("foo");

        Predicate<Boolean> noNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();


        Function<String,Integer> toInteger = Integer::valueOf;
        Function<String,String> backToString = toInteger.andThen(String::valueOf);

        backToString.apply("124");

        //Suppliers
        Supplier<Person> personSupplier = Person::new;
        personSupplier.get();

        // Consumers
        Consumer<Person> greeter = (p) ->System.out.println("Hello, " + p.firstName);
        greeter.accept(new Person("Luke","Skywalker"));

        //Comparators
        Comparator<Person> comparator =(p1,p2) ->p1.firstName.compareTo(p2.firstName);

        Person p1=new Person("john","Doe");
        Person p2 = new Person("Alice","Wonderland");

        comparator.compare(p1,p2);
        Runnable runnable = ()-> System.out.println(UUID.randomUUID());
        runnable.run();

        Callable<UUID> callable = UUID::randomUUID;
        try {
            callable.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

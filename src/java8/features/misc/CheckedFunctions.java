package java8.features.misc;

import java.nio.file.LinkPermission;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author dong
 * @version 1.0.0
 * @ClassName CheckedFunctions.java
 * @Description TODO
 * @createTime 2021年08月29日 08:37:00
 */
public class CheckedFunctions {

    @FunctionalInterface
    public interface CheckedConsumer<T> {
        void accept(T input) throws Exception;
    }

    @FunctionalInterface
    public interface CheckedPredicates<T> {
        boolean test(T input) throws Exception;
    }

    @FunctionalInterface
    public interface CheckedFunction<F, T> {
        T apply(F input) throws Exception;
    }

    public static <F, T> Function<F, T> function(CheckedFunction<F, T> function) {
        return input -> {
            try {
                return function.apply(input);
            } catch (Exception e) {
                if (e instanceof RuntimeException) {
                    throw (RuntimeException) e;
                }
                throw new RuntimeException(e);
            }
        };
    }

    public static <T> Predicate<T> predicate(CheckedPredicates<T> predicate) {
        return input -> {
            try {
                return predicate.test(input);
            } catch (Exception e) {
                if (e instanceof RuntimeException) {
                    throw (RuntimeException) e;
                }
                throw new RuntimeException(e);
            }
        };

    }

    public static <T> Consumer<T> consumer(CheckedConsumer<T> consumer) {
        return input -> {
            try {
                consumer.accept(input);
            } catch (Exception e) {
                if (e instanceof RuntimeException) {
                    throw (RuntimeException) e;
                }
                throw new RuntimeException(e);
            }
        };
    }
}

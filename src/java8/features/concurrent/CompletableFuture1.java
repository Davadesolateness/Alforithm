package java8.features.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author dong
 * @version 1.0.0
 * @ClassName CompletableFuture1.java
 * @Description TODO
 * @createTime 2021年08月29日 11:08:00
 */
public class CompletableFuture1 {

    public static void main(String ...args) throws ExecutionException, InterruptedException{
        CompletableFuture<String> future = new CompletableFuture<>();
        future.complete("42");
        future
                .thenAccept(System.out::println)
                .thenAccept(v-> System.out.println("done"));
    }
}

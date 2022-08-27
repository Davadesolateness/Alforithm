package java8.features.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author dong
 * @version 1.0.0
 * @ClassName ConcurrentUtils.java
 * @Description TODO
 * @createTime 2021年08月29日 10:49:00
 */
public class ConcurrentUtils {

    public static void stop(ExecutorService executor){
        try{
            executor.shutdown();
            executor.awaitTermination(60, TimeUnit.SECONDS);
        }catch (InterruptedException e){
            System.err.println("termination interrupted");;
        }finally {
            if(!executor.isTerminated()){
                System.out.println("killing non-finished tasks");
            }
            executor.shutdown();
        }
    }

    public static void sleep(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        }catch (InterruptedException e){
            throw new IllegalStateException(e);
        }
    }
}

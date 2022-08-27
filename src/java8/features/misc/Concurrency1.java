package java8.features.misc;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author dong
 * @version 1.0.0
 * @ClassName Concurrency1.java
 * @Description TODO
 * @createTime 2021年08月29日 08:49:00
 */
public class Concurrency1 {

    public static void main(String[] args) {
        ConcurrentHashMap<Integer, UUID> concurrentHashMap = new ConcurrentHashMap<>();

        for (int i = 0; i < 100; i++) {
            concurrentHashMap.put(i,UUID.randomUUID());
        }

        int threshold = 1;

        concurrentHashMap.forEachValue(threshold, System.out::println);

        concurrentHashMap.forEach((id,uuid)->{
            if (id % 10 == 0){
                System.out.println(String.format("%s: %s",id,uuid));
            }
        });

        UUID searchResult = concurrentHashMap.search(threshold,(id,uuid)->{
            if(String.valueOf(uuid).startsWith(String.valueOf(id))){
                return uuid;
            }
            return null;
        });

        System.out.println(searchResult);
    }
}

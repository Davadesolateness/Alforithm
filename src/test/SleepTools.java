package test;

import java.util.concurrent.TimeUnit;

/**
 * @description: TODO
 * @author dongzhibo
 * @date 2023/3/10 18:18
 * @version 1.0
 */
public class SleepTools {

    /**
     * @description
     * @params seconds
     * @exception 
     * @return 
     * @author dongzhibo
     * @date 2023/3/10 18:22
     */
    public static final void second(int seconds){
        try{
            TimeUnit.SECONDS.sleep(seconds);
        }catch (InterruptedException e){
            
        }
    }

    public static final void ms(int seconds){
        try {
            TimeUnit.MICROSECONDS.sleep(seconds);
        }catch (InterruptedException e){

        }
    }
    
    
}

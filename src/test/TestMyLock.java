package test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: TODO
 * @author dongzhibo
 * @date 2023/3/10 18:30
 * @version 1.0
 */
public class TestMyLock {

    public void test(){
        final Lock lock = new CustomerLock();

        class Worker extends Thread{
            @Override
            public void run(){
                while (true){
                    lock.lock();
                    try {
                        SleepTools.second(1);
                        System.out.println(Thread.currentThread().getName());
                        SleepTools.second(1);
                    }catch (Exception e){

                    }finally {
                        lock.unlock();
                    }
                    SleepTools.second(2);
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            Worker w = new Worker();
            w.setDaemon(true);
            w.start();
        }

        for (int i = 0; i < 10; i++) {
            SleepTools.second(2);
            System.out.println();
        }
    }
}

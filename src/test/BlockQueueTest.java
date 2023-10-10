package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author dongzhibo
 * @version 1.0
 * @description: TODO
 * @date 2023/3/28 17:15
 */
public class BlockQueueTest {

    private class MyReentrantLock extends AbstractQueuedSynchronizer {
        protected final boolean tryAcquire(int acquires) {
            final Thread current = Thread.currentThread();
            while (true) {
                int c = getState();
                if (c == 0) {
                    if (compareAndSetState(0, acquires)) {
                        setExclusiveOwnerThread(current);
                        return true;
                    }
                }
            }
        }

        protected final boolean tryRelease(int releases) {
            int c = getState() - releases;
            if (Thread.currentThread() != getExclusiveOwnerThread()) {
                throw new IllegalMonitorStateException();
            }
            boolean free = false;
            if (c == 0) {
                free = true;
                setExclusiveOwnerThread(null);
            }
            setState(c);
            return free;
        }
    }

    public void test1() throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        long begin = System.currentTimeMillis();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 2; i++) {
            executorService.submit(() ->
            {
                for (int j = 0; j < 50000000; j++) {
                    reentrantLock.lock();
                    doBusiness();
                    reentrantLock.unlock();
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        System.out.println("ReentrantLock cost : " + (System.currentTimeMillis() - begin));
    }

    public void test2() throws InterruptedException {
        MyReentrantLock myReentrantLock = new MyReentrantLock();
        long begin = System.currentTimeMillis();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 2; i++) {
            executorService.submit(() -> {
                myReentrantLock.tryAcquire(1);
                doBusiness();
                myReentrantLock.tryRelease(1);
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        System.out.println("MyReentrantLock cost : " + (System.currentTimeMillis() - begin));
    }

    private void doBusiness() {

    }

}

package test;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @description: TODO
 * @author dongzhibo
 * @date 2023/3/11 14:15
 * @version 1.0
 */
public class BooleanLatchTest {

    private static class Sync extends AbstractQueuedSynchronizer{

        boolean isSignalled(){
            return getState() == 0;
        }

        protected int tryAcquireShared(int ignore){
            return isSignalled() ? 1 : -1;
        }

        protected boolean tryReleaseShared(int ignore){
            setState(1);
            return true;
        }
    }

    private final Sync sync = new Sync();

    public boolean isSignalled(){
        return sync.isSignalled();
    }

    public void signal(){
        sync.releaseShared(1);
    }

    public void await() throws InterruptedException{
        sync.acquireSharedInterruptibly(1);
    }
}

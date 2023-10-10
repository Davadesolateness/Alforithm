package test;

import com.sun.corba.se.impl.orbutil.concurrent.Sync;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @description: TODO
 * @author dongzhibo
 * @date 2023/3/10 17:14
 * @version 1.0
 */
public class CustomerLock  implements Lock {

    private final Sync sync = new Sync();

    private static class Sync extends AbstractQueuedSynchronizer{
        @Override
        protected boolean tryAcquire(int arg){
            if (compareAndSetState(0,1)){
                // 当前线程获取到锁
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }else {
                return false;
            }
        }

        @Override
        protected boolean tryRelease(int arg){
            // 如果状态为没人占用  还去释放，就报错
            if (getState() == 0){
                throw new UnsupportedOperationException();
            }
            // 把锁的占用者置为空
            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }

        @Override
        protected boolean isHeldExclusively(){
            return getState() == 1;
        }


        public Condition getCondition(){
            return new ConditionObject();
        }


    }

    @Override
    public void lock() {
        sync.acquire(1);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {
        sync.acquireInterruptibly(1);
    }

    @Override
    public boolean tryLock() {
        return sync.tryAcquire(1);
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return sync.tryAcquireNanos(1,unit.toNanos(time));
    }

    @Override
    public void unlock() {
        sync.release(1);
    }

    @Override
    public Condition newCondition() {
        return sync.getCondition();
    }
}

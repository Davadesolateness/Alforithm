package DesignMethod.Singel;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/7 16:22
 * @Version 1.0
 */
public class Singleton2 {
    //单例模式
    //第一种
    private static Singleton2 instance = new Singleton2();

    private Singleton2() {
    }

    ;

    public Singleton2 getInstance() {
        return instance;
    }

    //第二种饿汉模式
    private static Singleton2 instance1 = null;

    static {
        instance1 = new Singleton2();
    }

    public Singleton2 getInstance1() {
        return instance1;
    }

    //第三种懒加载
    private static Singleton2 instance2 = null;

    public Singleton2 getInstance2() {
        if (instance2 == null) {
            instance2 = new Singleton2();
        }
        return instance2;  //实现懒加载但是多线程下会创建两个对象
    }

    //解决多线程问题：对Singleton加锁,但是效率太低了
    public synchronized Singleton2 getInstance3() {
        if (instance2 == null) {
            instance2 = new Singleton2();
        }
        return instance2;
    }

    //也是线程不安全的，第二个线程进入if语句也会创建新的对象
    public Singleton2 getInstance4() {
        if (instance2 == null) {
            synchronized (Singleton2.class) {
                instance2 = new Singleton2();
            }
        }
        return instance;
    }

    //双重校验
    public Singleton2 getInstance5() {
        if (instance2 == null) {
            synchronized (Singleton2.class) {
                if (instance2 == null) {
                    instance2 = new Singleton2();
                }
            }
        }
        return instance;
    }

    //内部类的方法
    private static class SingletonHolder{
        private static Singleton2 instance = new Singleton2();
    }
    public static Singleton2 getInstance6(){
        return SingletonHolder.instance;
    }

    //
}

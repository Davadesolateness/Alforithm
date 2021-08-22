package DesignMethod.Singel;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/7 16:08
 * @Version 1.0
 */
/*       (1)不允许其他程序用new对象。
因为new就是开辟新的空间，在这里更改数据只是更改的所创建的对象的数据，如果可以new的话，
每一次new都产生一个对象，这样肯定保证不了对象的唯一性。
        (2)在该类中创建对象
           因为不允许其他程序new对象，所以这里的对象需要在本类中new出来
        (3)对外提供一个可以让其他程序获取该对象的方法
           因为对象是在本类中创建的，所以需要提供一个方法让其它的类获取这个对象。*/
public class Singleton {

    //第一种方法实现单例模式
   /* private static Singleton instance = new Singleton();
    private Singleton(){};
    public static Singleton getInstance(){
        return instance;
    }*/

    //实现饿汉模式
    //可以看到上面的代码是按照在2中分析的那三步来实现的，
    // 这中写法被称为饿汉式，因为它在类创建的时候就已经实例化了对象
   /* private static Singleton instance  = null

    static {
        instance=new Singleton();
    }
    private Singleton(){};
    public static Singleton getInstance(){
        return instance;
    }*/

   /*private static Singleton instance = null;
   private Singleton(){};
   public static synchronized Singleton getInstance(){
       if (instance == null){
           instance = new Singleton();
       }
       return instance;
   }*/

    /**
     * 懒汉式变种，属于懒汉式中最好的写法，保证了：延迟加载和线程安全
     */
    private static Singleton instance = null;
    private Singleton(){};
    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return  instance;
    }
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }
}


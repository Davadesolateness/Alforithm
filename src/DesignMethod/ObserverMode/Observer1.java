package DesignMethod.ObserverMode;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/7 18:14
 * @Version 1.0
 */
public class Observer1 implements Observer{
    private Subject subject;

    public Observer1(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("observer1 得到 3D 号码  -->" + msg + ", 我要记下来。");
    }
}

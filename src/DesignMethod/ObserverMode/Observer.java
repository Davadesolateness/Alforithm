package DesignMethod.ObserverMode;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/7 18:07
 * @Version 1.0
 */

/**
 * 所有观察者都要是实现此接口
 */
public interface Observer {
    public void update(String msg);
}

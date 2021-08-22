package DesignMethod.ObserverMode;


/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/7 18:04
 * @Version 1.0
 */
//主题接口，所有主题必须实现此接口
public interface Subject {
    /**
     * 注册一个观察者
     *
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 移除一个观察者
     *
     * @param observer
     */
    public void removeObsrver(Observer observer);

    /**
     * 通知所有观察者
     */
    public void notifyObservers();
}

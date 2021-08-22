package DesignMethod.ObserverMode;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/7 18:18
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //模拟3D信号
        ObjectFor3D subjectFor3d = new ObjectFor3D();
        //客户1
        Observer observer1 = new Observer1(subjectFor3d);
        Observer observer2 = new Observer2(subjectFor3d);

        subjectFor3d.setMsg("20140420的3D号码是：127" );
        subjectFor3d.setMsg("20140421的3D号码是：333" );
    }
}

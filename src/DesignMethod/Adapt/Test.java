package DesignMethod.Adapt;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/7 19:29
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        V5Power v5Power = new V5PowerAdapter(new V220Power());
        mobile.inputPower(v5Power);
    }
}

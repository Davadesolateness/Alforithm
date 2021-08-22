package DesignMethod.Adapt;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/7 19:23
 * @Version 1.0
 */
public class Mobile {
    /**
     *
     * 充电
     */
        public void inputPower(V5Power power){
        int provideV5Power = power.provideV5Power();
        System.out.println("手机（客户端）：我需要5V电压充电，现在是-->" + provideV5Power + "V");
    }
}

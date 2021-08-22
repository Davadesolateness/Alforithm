package DesignMethod.StrategyPattern;

import com.sun.corba.se.spi.ior.Identifiable;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/7 19:15
 * @Version 1.0
 */
public class DefendTBS implements IDefendBehavior {
    @Override
    public void defend() {

        System.out.println("铁布衫");
    }
}

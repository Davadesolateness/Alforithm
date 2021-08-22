package DesignMethod.StrategyPattern;

import DesignMethod.Factory.SimpleFactory.RoujiaMoStore2;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/7 18:33
 * @Version 1.0
 */
public class RoleA extends Role {

    public RoleA(String name){
        this.name= name;
    }
    @Override
    protected void display() {
        System.out.println("样子1");
    }

    @Override
    protected void run() {
        System.out.println("金蝉脱壳");
    }

    @Override
    protected void attack() {
        System.out.println("降龙十八掌");
    }

    @Override
    protected void defend() {
        System.out.println("铁头功");
    }
}

package DesignMethod.StrategyPattern;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/7 19:03
 * @Version 1.0
 */
public class AttackJY implements IAttackBehavior{

    @Override
    public void attack() {
        System.out.println("九阳神功！");
    }
}

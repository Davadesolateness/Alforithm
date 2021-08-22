package DesignMethod.StrategyPattern;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/7 19:20
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Role1 roleA = new RoleA1("A");

        roleA.setAttackBehavior(new AttackJY())//
                .setDefendBehavior(new DefendTBS())//
                .setRunBehavior(new RunJCTQ());
        System.out.println(roleA.name + ":");
        roleA.run();
        roleA.attack();
        roleA.defend();
    }
}

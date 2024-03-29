package DesignMethod.StrategyPattern;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/7 19:17
 * @Version 1.0
 */
public abstract class Role1 {
    protected String name;

    protected IDefendBehavior defendBehavior;
    protected IDisplayBehavior displayBehavior;
    protected IRunBehavior runBehavior;
    protected IAttackBehavior attackBehavior;

    public Role1 setDefendBehavior(IDefendBehavior defendBehavior) {
        this.defendBehavior = defendBehavior;
        return this;
    }

    public Role1 setRunBehavior(IRunBehavior runBehavior) {
        this.runBehavior = runBehavior;
        return this;
    }

    public Role1 setAttackBehavior(IAttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
        return this;
    }

    protected void display() {
        displayBehavior.display();
    }

    protected void run() {
        runBehavior.run();
    }

    protected void attack() {
        attackBehavior.attack();
    }

    protected void defend() {
        defendBehavior.defend();
    }

}

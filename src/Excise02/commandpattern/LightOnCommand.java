package Excise02.commandpattern;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/12/20 10:00
 * @Version 1.0
 */
public class LightOnCommand implements Command {
    Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}

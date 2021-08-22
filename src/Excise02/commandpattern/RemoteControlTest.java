package Excise02.commandpattern;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/12/20 10:04
 * @Version 1.0
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();
    }
}

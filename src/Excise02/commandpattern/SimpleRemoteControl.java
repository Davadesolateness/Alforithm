package Excise02.commandpattern;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/12/20 10:03
 * @Version 1.0
 */
public class SimpleRemoteControl {
    Command slot;

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}

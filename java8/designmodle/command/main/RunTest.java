package designmodle.command.main;

import designmodle.command.entity.Door;
import designmodle.command.impl.DoorColseCommand;
import designmodle.command.impl.DoorOpenCommand;
import designmodle.command.invoker.CommandInvoker;

/**
 * Created by xinjian.ye on 2018/5/24.
 */
public class RunTest {
    public static void main(String[] args) {
        CommandInvoker invoker = new CommandInvoker();

        Door door1 = new Door("正门");
        DoorOpenCommand openCommand = new DoorOpenCommand(door1);

        invoker.setCommand(openCommand);
        invoker.pressButton();

        DoorColseCommand colseCommand = new DoorColseCommand(door1);

        invoker.setCommand(colseCommand);
        invoker.pressButton();
    }
}

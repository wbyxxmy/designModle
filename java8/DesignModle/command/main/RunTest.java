package DesignModle.command.main;

import DesignModle.command.entity.Door;
import DesignModle.command.impl.DoorColseCommand;
import DesignModle.command.impl.DoorOpenCommand;
import DesignModle.command.invoker.CommandInvoker;

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

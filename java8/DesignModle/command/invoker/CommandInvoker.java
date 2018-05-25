package DesignModle.command.invoker;

import DesignModle.command.api.ICommand;

/**
 * Created by xinjian.ye on 2018/5/24.
 */
public class CommandInvoker {
    //TODO: 判断是否为空
    private ICommand command;

    public void pressButton() {
        if(command != null) {
            synchronized (CommandInvoker.class) {
                if(command != null) {
                    command.excute();
                }
            }
        }
    }

    public ICommand getCommand() {
        return command;
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

}

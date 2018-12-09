package designmodle.command.impl;

import designmodle.command.api.ICommand;
import designmodle.command.entity.Door;

/**
 * Created by xinjian.ye on 2018/5/24.
 */
public class DoorOpenCommand implements ICommand {
    Door door;

    public DoorOpenCommand(Door door) {
        this.door = door;
    }

    @Override
    public void excute() {
        door.open();
    }
}

package DesignModle.command.entity;

/**
 * 门实体
 * Created by xinjian.ye on 2018/5/24.
 */
public class Door {
    private String doorName;

    public Door(String doorName) {
        this.doorName = doorName;
    }

    //TODO: 不可重复open
    public void open() {
        System.out.println("Open The Door: " + this);
    }

    //TODO: 不可重复关闭
    public void close() {
        System.out.println("Close The Door: " + this);
    }

    @Override
    public String toString() {
        return doorName;
    }

    public String getDoorName() {
        return doorName;
    }

    public void setDoorName(String doorName) {
        this.doorName = doorName;
    }
}

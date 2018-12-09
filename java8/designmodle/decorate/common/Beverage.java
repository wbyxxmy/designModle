package designmodle.decorate.common;

/**
 * 饮料
 * Created by xinjian.ye on 2018/2/10.
 */
public abstract class Beverage {
    public String description = "unknown Beverage";
    public CoffeeSizeEnum size = CoffeeSizeEnum.TALL;

    public abstract double cost();

    public CoffeeSizeEnum getSize() {
        return size;
    }

    public void setSize(CoffeeSizeEnum size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

}

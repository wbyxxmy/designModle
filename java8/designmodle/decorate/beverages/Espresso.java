package designmodle.decorate.beverages;

import designmodle.decorate.common.Beverage;

/**
 * 浓缩咖啡
 * Created by xinjian.ye on 2018/2/10.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return Double.parseDouble(this.getSize().getCode())*1.99;
    }
}

package designmodle.decorate.beverages;

import designmodle.decorate.common.Beverage;

/**
 * 低咖啡因
 * Created by xinjian.ye on 2018/2/10.
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf coffee";
    }

    @Override
    public double cost() {
        return Double.parseDouble(this.getSize().getCode())*1.05;
    }
}

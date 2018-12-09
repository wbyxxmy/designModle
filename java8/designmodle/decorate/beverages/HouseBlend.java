package designmodle.decorate.beverages;

import designmodle.decorate.common.Beverage;

/**
 * 综合
 * Created by xinjian.ye on 2018/2/10.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }
    @Override
    public double cost() {
        return Double.parseDouble(this.getSize().getCode())*1.22;
    }
}

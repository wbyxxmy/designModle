package designmodle.decorate.beverages;

import designmodle.decorate.common.Beverage;

/**
 * 深焙
 * Created by xinjian.ye on 2018/2/10.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return Double.parseDouble(this.getSize().getCode())*.99;
    }
}

package DesignModle.decorate.beverages;

import DesignModle.decorate.common.Beverage;

import java.math.BigDecimal;

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

package DesignModle.decorate.condiments;

import DesignModle.decorate.common.Beverage;
import DesignModle.decorate.common.CondimentDecorator;

/**
 * Created by xinjian.ye on 2018/2/10.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 1.00 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Soy";
    }
}

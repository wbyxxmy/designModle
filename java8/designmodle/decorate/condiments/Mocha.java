package designmodle.decorate.condiments;

import designmodle.decorate.common.Beverage;
import designmodle.decorate.common.CondimentDecorator;

/**
 * Created by xinjian.ye on 2018/2/10.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .20+beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Mocha";
    }
}

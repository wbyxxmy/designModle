package DesignModle.factory.factory;

import DesignModle.factory.common.SimplePizzaEnum;
import DesignModle.factory.pizza.*;

/**
 * Created by xinjian.ye on 2018/2/12.
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch(SimplePizzaEnum.parse(type)) {
            case CLAM:     pizza = new ClamPizza(); break;
            case GREEK:    pizza = new GreekPizza(); break;
            case CHEESE:   pizza = new CheesePizza(); break;
            case VEGGIE:   pizza = new VeggiePizza(); break;
            case PEPPERONI:pizza = new PepperoniPizza(); break;

            default: return null;
        }
        return pizza;
    }
}

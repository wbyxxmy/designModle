package designmodle.factory.store;

import designmodle.factory.factory.SimplePizzaFactory;
import designmodle.factory.pizza.Pizza;

/**
 * Created by xinjian.ye on 2018/2/12.
 */
public class MyFirstPizzaStore {
    SimplePizzaFactory factory;

    public MyFirstPizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {

        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}

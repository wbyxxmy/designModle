package DesignModle.factory.store;

import DesignModle.factory.factory.SimplePizzaFactory;
import DesignModle.factory.pizza.CheesePizza;
import DesignModle.factory.pizza.GreekPizza;
import DesignModle.factory.pizza.PepperoniPizza;
import DesignModle.factory.pizza.Pizza;

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

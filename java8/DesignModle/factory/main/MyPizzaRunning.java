package DesignModle.factory.main;

import DesignModle.factory.common.SimplePizzaEnum;
import DesignModle.factory.factory.SimplePizzaFactory;
import DesignModle.factory.store.MyFirstPizzaStore;

/**
 * Created by xinjian.ye on 2018/2/12.
 */
public class MyPizzaRunning {
    public static void main(String[] args) {
        MyFirstPizzaStore pizzaStore001 = new MyFirstPizzaStore(new SimplePizzaFactory());

        pizzaStore001.orderPizza(SimplePizzaEnum.CHEESE.getCode());
    }
}

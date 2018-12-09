package designmodle.factory.main;

import designmodle.factory.common.SimplePizzaEnum;
import designmodle.factory.factory.SimplePizzaFactory;
import designmodle.factory.store.MyFirstPizzaStore;

/**
 * Created by xinjian.ye on 2018/2/12.
 */
public class MyPizzaRunning {
    public static void main(String[] args) {
        MyFirstPizzaStore pizzaStore001 = new MyFirstPizzaStore(new SimplePizzaFactory());

        pizzaStore001.orderPizza(SimplePizzaEnum.CHEESE.getCode());
    }
}

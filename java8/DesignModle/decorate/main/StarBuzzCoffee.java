package DesignModle.decorate.main;

import DesignModle.decorate.beverages.DarkRoast;
import DesignModle.decorate.beverages.Espresso;
import DesignModle.decorate.beverages.HouseBlend;
import DesignModle.decorate.common.Beverage;
import DesignModle.decorate.common.CoffeeSizeEnum;
import DesignModle.decorate.condiments.Mocha;
import DesignModle.decorate.condiments.Soy;
import DesignModle.decorate.condiments.Whip;

/**
 * Created by xinjian.ye on 2018/2/10.
 */
public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage11 = new Espresso();
        beverage11.setSize(CoffeeSizeEnum.VENTI);
        System.out.println(beverage11.getDescription() + " $" + beverage11.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }
}

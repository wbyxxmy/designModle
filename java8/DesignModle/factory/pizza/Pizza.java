package DesignModle.factory.pizza;

import static common.PrintUtil.print;

/**
 * Created by xinjian.ye on 2018/2/12.
 */
public abstract class Pizza {

    public void prepare(){
        print("preparing a pizza");
    }
    public void bake(){
        print("baking the pizza");
    }
    public void cut(){
        print("cuting a pizza");
    }
    public void box(){
        print("boxing a pizza");
    }
}

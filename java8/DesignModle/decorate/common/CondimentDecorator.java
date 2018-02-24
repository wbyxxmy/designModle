package DesignModle.decorate.common;

import DesignModle.decorate.common.Beverage;

/**
 * 调料
 * Created by xinjian.ye on 2018/2/10.
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}

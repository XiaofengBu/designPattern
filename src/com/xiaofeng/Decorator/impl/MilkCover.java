package com.xiaofeng.Decorator.impl;

import com.xiaofeng.Decorator.Beverage;
import com.xiaofeng.Decorator.CondimentDecorator;

public class MilkCover extends CondimentDecorator {
    private Beverage beverage;
    public MilkCover(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDesc() {
        return "milkCover+"+this.beverage.getDesc();
    }

    @Override
    public double cost() {
        return 1.7 + this.beverage.cost();
    }
}

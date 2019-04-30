package com.xiaofeng.Decorator.impl;

import com.xiaofeng.Decorator.Beverage;
import com.xiaofeng.Decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDesc() {
        return "Mocha+"+beverage.getDesc();
    }

    @Override
    public double cost() {
        return 1.0+beverage.cost();
    }
}

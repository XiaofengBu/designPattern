package com.xiaofeng.Decorator.impl;

import com.xiaofeng.Decorator.Beverage;

public class Coffee extends Beverage {
    public Coffee(){
        desc = "Coffee";
    }

    @Override
    public double cost() {
        return 2.5;
    }
}

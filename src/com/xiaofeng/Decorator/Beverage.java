package com.xiaofeng.Decorator;

/**
 * 饮料的抽象类
 * @author buxiaofeng
 */
public abstract class Beverage {
    protected String desc = "unknown";
    public String getDesc(){
        return desc;
    }
    public abstract double cost();
}

package com.xiaofeng.Decorator;

public abstract class CondimentDecorator extends Beverage{
    /**
     * 调料必须覆盖Beverage的描述
     * @return
     */
    @Override
    public abstract String getDesc();
}

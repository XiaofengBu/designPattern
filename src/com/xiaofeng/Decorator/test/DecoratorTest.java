package com.xiaofeng.Decorator.test;

import com.xiaofeng.Decorator.Beverage;
import com.xiaofeng.Decorator.impl.Coffee;
import com.xiaofeng.Decorator.impl.MilkCover;
import com.xiaofeng.Decorator.impl.Mocha;
import org.junit.Test;

/**
 * 装饰者
 */
public class DecoratorTest {
    @Test
    public void decoratorTest(){
        Beverage coffee = new Coffee();
        System.out.println(coffee.getDesc());
        System.out.println(coffee.cost());
        coffee = new Mocha(coffee);
        coffee = new MilkCover(coffee);
        System.out.println(coffee.getDesc());
        System.out.println(coffee.cost());
    }
}

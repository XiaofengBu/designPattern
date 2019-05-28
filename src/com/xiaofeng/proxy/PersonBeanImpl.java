package com.xiaofeng.proxy;

public class PersonBeanImpl implements PersonBean {
    private String name;
    public PersonBeanImpl(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {
        try {
            //假设数钱花了一秒时间
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "上交班费50元");
    }
}

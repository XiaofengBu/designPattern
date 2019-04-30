package com.xiaofeng.observer.impl;

import com.xiaofeng.observer.Observer;

public class Man implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("Man"+msg);
    }
}

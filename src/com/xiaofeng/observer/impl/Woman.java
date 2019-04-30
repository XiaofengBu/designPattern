package com.xiaofeng.observer.impl;

import com.xiaofeng.observer.Observer;

public class Woman implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("Woman"+msg);
    }
}

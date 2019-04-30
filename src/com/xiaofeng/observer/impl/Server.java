package com.xiaofeng.observer.impl;

import com.xiaofeng.observer.Observer;
import com.xiaofeng.observer.Observerable;

import java.util.ArrayList;
import java.util.List;

public class Server implements Observerable {
    List<Observer> observerList;
    public Server(){
        this.observerList = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observerList){
            observer.update("服务器发了个消息");
        }
    }
}

package com.xiaofeng.observer;

/**
 * 被观察对象
 * @author buxiaofeng
 */
public interface Observerable {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}

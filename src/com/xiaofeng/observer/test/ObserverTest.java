package com.xiaofeng.observer.test;

import com.xiaofeng.observer.impl.Man;
import com.xiaofeng.observer.impl.Server;
import com.xiaofeng.observer.impl.Woman;
import org.junit.Test;

/**
 * 观察者
 */
public class ObserverTest {
    @Test
    public void observerTest(){
        Server server = new Server();
        Man man = new Man();
        Woman woman = new Woman();
        server.registerObserver(man);
        server.registerObserver(woman);
        server.notifyObservers();
        server.removeObserver(man);
        server.notifyObservers();
    }
}

package com.xiaofeng.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {

        //创建一个实例对象，这个对象是被代理的对象
        PersonBean zhangsan = new PersonBeanImpl("张三");

        //创建一个与代理对象相关联的InvocationHandler
        InvocationHandler stuHandler = new StuInvocationHandler<PersonBean>(zhangsan);

        //创建一个代理对象stuProxy来代理zhangsan，代理对象的每个执行方法都会替换执行Invocation中的invoke方法
        PersonBean stuProxy = (PersonBean) Proxy.newProxyInstance(PersonBean.class.getClassLoader(), new Class<?>[]{PersonBean.class}, stuHandler);
        //代理执行上交班费的方法
        stuProxy.giveMoney();
    }
}

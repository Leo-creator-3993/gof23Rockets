package com.future.rocket.gof23.observer.impl2;

import com.future.rocket.gof23.observer.impl2.iface.XObserver;

//观察者实例
public class Subscriber implements XObserver {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(String.format("%s 接收到新闻消息==>【%s】", name, news));
    }
}

package com.future.rocket.gof23.observer.impl2;

import com.future.rocket.gof23.observer.impl2.iface.XObserver;
import com.future.rocket.gof23.observer.impl2.iface.XSubject;

import java.util.ArrayList;
import java.util.List;

//被观察者实例
public class NewsAgent implements XSubject {
    private final List<XObserver> observers = new ArrayList<>();
    private String news;

    @Override
    public void registerObserver(XObserver xObserver) {
        observers.add(xObserver);
    }

    @Override
    public void removeObserver(XObserver xObserver) {
        observers.remove(xObserver);
    }

    @Override
    public void notifyObservers() {
        for (XObserver observer : observers) {
            observer.update(news);
        }
    }

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }
}

package com.future.rocket.gof23.observer.impl2.iface;

//被观察者
public interface XSubject {
    void registerObserver(XObserver xObserver);
    void removeObserver(XObserver xObserver);
    void notifyObservers();
}

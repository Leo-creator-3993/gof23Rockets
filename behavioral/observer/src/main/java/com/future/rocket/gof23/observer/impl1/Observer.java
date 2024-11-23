package com.future.rocket.gof23.observer.impl1;

//观察者
public abstract class Observer {
    protected Subject subject;
    public abstract void update(int state);
}

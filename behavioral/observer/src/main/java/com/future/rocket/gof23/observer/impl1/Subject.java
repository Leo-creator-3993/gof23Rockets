package com.future.rocket.gof23.observer.impl1;

import java.util.ArrayList;
import java.util.List;


//被观察者
public class Subject {
    private final List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        System.out.println("## Set state to " + state);
        notifyObservers(state);
    }

    public void attach(Observer observer) {
        System.out.println("## Attach observer " + observer);
        observers.add(observer);
    }

    public void detach(Observer observer) {
        System.out.println("## Detach observer " + observer);
        observers.remove(observer);
    }

    public void detachAllObservers() {
        System.out.println("## Detach all observers");
        observers.clear();
    }

    private void notifyObservers(int state) {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}

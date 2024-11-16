package com.future.rocket.gof23.singleton;

public class SingletonObject {

    private static SingletonObject instance = new SingletonObject();

    private SingletonObject() {
    }

    public static SingletonObject getInstance() {
        return instance;
    }

    public void launch() {
        System.out.println("Seat very carefully, gof23 rocket now is launching!");
    }
}
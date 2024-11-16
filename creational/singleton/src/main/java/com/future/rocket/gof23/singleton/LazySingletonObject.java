package com.future.rocket.gof23.singleton;

public class LazySingletonObject {

    private static LazySingletonObject instance;

    public static LazySingletonObject getInstance() {
        if(null == instance) {
            synchronized (LazySingletonObject.class) {
                if(null == instance) {
                    instance = new LazySingletonObject();
                }
            }
        }
        return instance;
    }

    public void launch() {
        System.out.println("Hold on please, gof23 rocket launch at once...");
    }
}

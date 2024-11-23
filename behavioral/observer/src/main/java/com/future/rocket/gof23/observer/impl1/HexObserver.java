package com.future.rocket.gof23.observer.impl1;

public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(int state) {
        System.out.println("HexObserver receive and Magic: " + Integer.toHexString(state));
    }
}

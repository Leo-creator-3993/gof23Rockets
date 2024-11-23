package com.future.rocket.gof23.observer.impl1;

public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(int state) {
        System.out.println("BinaryObserver receive and Magic: " + Integer.toBinaryString(state));
    }
}

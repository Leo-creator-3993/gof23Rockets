package com.future.rocket.gof23.observer.impl1;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(int state) {
        System.out.println("OctalObserver receive and Magic: " + Integer.toOctalString(state));
    }
}

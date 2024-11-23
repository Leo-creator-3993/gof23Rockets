package com.future.rocket.gof23.observer.impl1;

import com.future.rocket.gof23.common.OtherTool;

public class ObserverImplMain1 {

    public static void main(String[] args) {
        System.out.println("hi, welcome to gof23 rockets, now we in observer house...");
        OtherTool.printSplitLine();

        Subject subject = new Subject();
        Observer hexObserver = new HexObserver(subject);
        Observer octalObserver = new OctalObserver(subject);
        Observer binaryObserver = new BinaryObserver(subject);
        subject.setState(10);
        OtherTool.printSplitLine();
        subject.detach(hexObserver);
        subject.setState(16);
        OtherTool.printSplitLine();
        subject.detachAllObservers();
        subject.setState(42);
        OtherTool.printSplitLine();
        subject.attach(octalObserver);
        subject.attach(binaryObserver);
        subject.setState(33);
    }
}

package com.future.rocket.gof23.observer.impl2;

import com.future.rocket.gof23.common.OtherTool;
import com.future.rocket.gof23.observer.impl2.iface.XObserver;

public class ObserverImplMain2 {
    public static void main(String[] args) {
        System.out.println("hi, welcome to gof23 rockets, now we in another observer house...");
        OtherTool.printSplitLine();

        XObserver leo = new Subscriber("leo");
        XObserver foo = new Subscriber("foo");
        XObserver lin = new Subscriber("lin");

        NewsAgent newsAgent = new NewsAgent();
        newsAgent.registerObserver(leo);
        newsAgent.registerObserver(foo);
        newsAgent.registerObserver(lin);
        newsAgent.setNews("明天晴天, 天气凉爽,适合爬山!");
        OtherTool.printSplitLine();
        newsAgent.removeObserver(foo);
        newsAgent.setNews("明天早上8点起来去跑步🏃");
        OtherTool.printSplitLine();
        newsAgent.removeObserver(lin);
        newsAgent.setNews("一切安好!");
    }
}

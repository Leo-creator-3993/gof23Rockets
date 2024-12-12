package com.future.rocket.gof23.frontController.dispatcher;

import com.future.rocket.gof23.frontController.enums.RequestType;
import com.future.rocket.gof23.frontController.handler.FooView;
import com.future.rocket.gof23.frontController.handler.HomeView;

public class Dispatcher {
    private HomeView homeView;
    private FooView fooView;

    public Dispatcher() {
        this.homeView = new HomeView();
        this.fooView = new FooView();
    }

    public void dispatch(RequestType requestType) {
        if(RequestType.HOME == requestType) {
            homeView.show();
        } else if(RequestType.FOO == requestType) {
            fooView.show();
        } else {
            throw new IllegalArgumentException("非法的请求类型!");
        }
    }
}

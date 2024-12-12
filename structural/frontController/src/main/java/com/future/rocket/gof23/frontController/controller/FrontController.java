package com.future.rocket.gof23.frontController.controller;

import com.future.rocket.gof23.frontController.dispatcher.Dispatcher;
import com.future.rocket.gof23.frontController.enums.RequestType;

public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        this.dispatcher = new Dispatcher();
    }

    public void dispatchRequest(RequestType requestType) {
        trackRequest(requestType);
        if(isAuthenticatedUser()) {
            dispatcher.dispatch(requestType);
        }
    }

    private boolean isAuthenticatedUser() {
        System.out.println("Authenticated successfully!");
        return true;
    }

    private void trackRequest(RequestType requestType) {
        System.out.println("Tracking request... requestType: " + requestType);
    }
}

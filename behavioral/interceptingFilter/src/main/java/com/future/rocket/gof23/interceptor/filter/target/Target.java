package com.future.rocket.gof23.interceptor.filter.target;

public class Target {
    public void execute(String request) {
        System.out.println("Target executing..." + request);
    }
}

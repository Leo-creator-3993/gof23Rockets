package com.future.rocket.gof23.chain.impl;

import com.future.rocket.gof23.chain.behavior.AbstractLogger;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ErrorLogger, message ==> " + message);
    }
}

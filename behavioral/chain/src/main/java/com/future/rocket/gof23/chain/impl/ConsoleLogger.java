package com.future.rocket.gof23.chain.impl;

import com.future.rocket.gof23.chain.behavior.AbstractLogger;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ConsoleLogger, message ==> " + message);
    }
}

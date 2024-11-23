package com.future.rocket.gof23.chain.impl;

import com.future.rocket.gof23.chain.behavior.AbstractLogger;

public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("FileLogger, message ==> " + message);
    }
}

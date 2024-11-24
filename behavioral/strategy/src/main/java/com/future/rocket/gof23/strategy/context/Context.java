package com.future.rocket.gof23.strategy.context;

import com.future.rocket.gof23.strategy.iface.Strategy;

public class Context {
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}

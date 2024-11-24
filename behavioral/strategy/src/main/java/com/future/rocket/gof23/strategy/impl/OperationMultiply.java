package com.future.rocket.gof23.strategy.impl;

import com.future.rocket.gof23.strategy.iface.Strategy;

public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}

package com.future.rocket.gof23.strategy.impl;

import com.future.rocket.gof23.strategy.iface.Strategy;

public class OperationDivide implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divide by zero");
        }
        return num1 / num2;
    }
}

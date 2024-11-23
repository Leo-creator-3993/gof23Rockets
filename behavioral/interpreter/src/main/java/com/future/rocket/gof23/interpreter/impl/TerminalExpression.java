package com.future.rocket.gof23.interpreter.impl;

import com.future.rocket.gof23.interpreter.iface.Context;
import com.future.rocket.gof23.interpreter.iface.Expression;

public class TerminalExpression implements Expression {
    private final String data;
    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(Context context) {
        return context.getContext().contains(data);
    }
}

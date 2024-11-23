package com.future.rocket.gof23.state.impl;

import com.future.rocket.gof23.state.iface.State;
import com.future.rocket.gof23.state.info.Context;

public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Start state doAction");
        context.setState(this);
    }
}

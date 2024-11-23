package com.future.rocket.gof23.state.impl;

import com.future.rocket.gof23.state.iface.State;
import com.future.rocket.gof23.state.info.Context;

public class UpState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("UpState doAction");
        context.setState(this);
    }
}

package com.future.rocket.gof23.state.impl;

import com.future.rocket.gof23.state.iface.State;
import com.future.rocket.gof23.state.info.Context;

public class DownState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("DownState doAction");
        context.setState(this);
    }
}

package com.future.rocket.gof23.state.iface;

import com.future.rocket.gof23.state.info.Context;

public interface State {
    void doAction(Context context);
}

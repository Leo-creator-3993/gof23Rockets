package com.future.rocket.gof23.builder.impl;

import com.future.rocket.gof23.builder.iface.Item;
import com.future.rocket.gof23.builder.iface.Packing;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}

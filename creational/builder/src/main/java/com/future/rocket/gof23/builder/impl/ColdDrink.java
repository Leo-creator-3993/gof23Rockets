package com.future.rocket.gof23.builder.impl;

import com.future.rocket.gof23.builder.iface.Item;
import com.future.rocket.gof23.builder.iface.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }
}

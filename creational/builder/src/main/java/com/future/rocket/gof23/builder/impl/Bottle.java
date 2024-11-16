package com.future.rocket.gof23.builder.impl;

import com.future.rocket.gof23.builder.iface.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "bottle type of packing";
    }
}

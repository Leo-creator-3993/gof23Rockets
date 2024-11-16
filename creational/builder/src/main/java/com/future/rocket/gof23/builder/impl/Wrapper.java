package com.future.rocket.gof23.builder.impl;

import com.future.rocket.gof23.builder.iface.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "wrapper type of packing";
    }
}

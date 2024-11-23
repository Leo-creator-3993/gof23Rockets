package com.future.rocket.gof23.nullobject.impl;

import com.future.rocket.gof23.nullobject.iface.AbstractCustomer;

public class NullCustomer extends AbstractCustomer {

    public NullCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return String.format("【%s】not register!", name);
    }
}

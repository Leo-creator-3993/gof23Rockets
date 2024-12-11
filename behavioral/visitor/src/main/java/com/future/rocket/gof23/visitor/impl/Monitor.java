package com.future.rocket.gof23.visitor.impl;

import com.future.rocket.gof23.visitor.iface.ComputerPart;
import com.future.rocket.gof23.visitor.iface.ComputerPartVisitor;

public class Monitor implements ComputerPart {

    private final String name;

    public Monitor(String name) {
        this.name = name;
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "name='" + name + '\'' +
                '}';
    }
}

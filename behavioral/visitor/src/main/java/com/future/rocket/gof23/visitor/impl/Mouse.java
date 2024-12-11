package com.future.rocket.gof23.visitor.impl;

import com.future.rocket.gof23.visitor.iface.ComputerPart;
import com.future.rocket.gof23.visitor.iface.ComputerPartVisitor;

public class Mouse implements ComputerPart {

    private final String name;

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + name + '\'' +
                '}';
    }
}

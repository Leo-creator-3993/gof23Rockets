package com.future.rocket.gof23.visitor.impl;

import com.future.rocket.gof23.visitor.iface.ComputerPart;
import com.future.rocket.gof23.visitor.iface.ComputerPartVisitor;

public class Line implements ComputerPart {

    private String name;

    public Line(String name) {
        this.name = name;
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

    @Override
    public String toString() {
        return "Line{" +
                "name='" + name + '\'' +
                '}';
    }
}

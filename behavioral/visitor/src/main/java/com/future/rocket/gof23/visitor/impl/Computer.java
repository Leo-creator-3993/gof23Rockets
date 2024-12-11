package com.future.rocket.gof23.visitor.impl;

import com.future.rocket.gof23.visitor.iface.ComputerPart;
import com.future.rocket.gof23.visitor.iface.ComputerPartVisitor;

public class Computer implements ComputerPart {

    private final String name;

    private final ComputerPart[] parts;

    public Computer(String name, ComputerPart[] parts) {
        this.name = name;
        this.parts = parts;
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for(ComputerPart computerPart : parts) {
            computerPart.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                '}';
    }
}

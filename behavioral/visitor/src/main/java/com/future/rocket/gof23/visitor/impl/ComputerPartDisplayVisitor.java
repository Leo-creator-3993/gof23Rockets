package com.future.rocket.gof23.visitor.impl;

import com.future.rocket.gof23.visitor.iface.ComputerPartVisitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Visit computer: " + computer);
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Visit mouse: " + mouse);
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Visit keyboard: " + keyboard);
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Visit monitor: " + monitor);
    }

    @Override
    public void visit(Line line) {
        System.out.println("Visit line: " + line);
    }
}

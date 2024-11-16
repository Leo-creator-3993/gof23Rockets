package com.future.rocket.gof23.prototype.impl;

import com.future.rocket.gof23.prototype.Shape;

public class Square extends Shape {

    public Square() {
        setType("Square");
    }

    @Override
    protected void draw() {
        System.out.println("Leo now drawing a square...");
    }
}

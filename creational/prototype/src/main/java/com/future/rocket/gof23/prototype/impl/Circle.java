package com.future.rocket.gof23.prototype.impl;

import com.future.rocket.gof23.prototype.Shape;

public class Circle extends Shape {

    public Circle() {
        setType("Circle");
    }

    @Override
    protected void draw() {
        System.out.println("Leo now drawing a circle...");
    }
}

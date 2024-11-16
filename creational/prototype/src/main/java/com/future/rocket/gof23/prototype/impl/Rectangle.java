package com.future.rocket.gof23.prototype.impl;

import com.future.rocket.gof23.prototype.Shape;

public class Rectangle extends Shape {

    public Rectangle() {
        setType("Rectangle");
    }

    @Override
    protected void draw() {
        System.out.println("Leo now drawing a rectangle...");
    }
}

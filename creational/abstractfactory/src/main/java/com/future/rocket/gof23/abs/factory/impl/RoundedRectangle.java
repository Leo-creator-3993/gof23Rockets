package com.future.rocket.gof23.abs.factory.impl;

import com.future.rocket.gof23.abs.factory.Shape;

public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Foo now learning to draw roundedRectangle...");
    }
}

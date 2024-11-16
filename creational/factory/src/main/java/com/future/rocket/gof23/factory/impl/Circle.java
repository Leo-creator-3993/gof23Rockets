package com.future.rocket.gof23.factory.impl;

import com.future.rocket.gof23.factory.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Leo now learning to draw circle...");
    }
}

package com.future.rocket.gof23.decorator.impl;

import com.future.rocket.gof23.decorator.iface.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Leo learning to draw a wonderful circle for you!");
    }
}

package com.future.rocket.gof23.decorator.impl;

import com.future.rocket.gof23.decorator.iface.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Foo said he love rectangle very much!");
    }
}

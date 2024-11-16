package com.future.rocket.gof23.abs.factory.impl;


import com.future.rocket.gof23.abs.factory.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Foo now learning to draw circle...");
    }
}

package com.future.rocket.gof23.flyweight.impl;

import com.future.rocket.gof23.flyweight.enums.ColorEnum;
import com.future.rocket.gof23.flyweight.iface.Shape;

public class Circle implements Shape {

    private ColorEnum color;

    private int x;
    private int y;
    private int radius;

    public Circle(ColorEnum color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Drawing circle, color:%s, x:%s, y:%s, radius:%s", color, x, y, radius));
    }

    @Override
    public String toString() {
        return String.format("Circle[color=%s, address=%s]", color, super.toString());
    }

}

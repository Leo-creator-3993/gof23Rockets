package com.future.rocket.gof23.bridge.struct;

import com.future.rocket.gof23.bridge.iface.DrawCircleApi;
import com.future.rocket.gof23.bridge.struct.base.Shape;

public class Circle extends Shape {
    private final DrawCircleApi drawCircleApi;
    private final int radius;
    private final int x;
    private final int y;

    public Circle(DrawCircleApi drawCircleApi, int radius, int x, int y) {
        this.drawCircleApi = drawCircleApi;
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawCircleApi.drawCircle(radius, x, y);
        System.out.println("done!");
    }
}

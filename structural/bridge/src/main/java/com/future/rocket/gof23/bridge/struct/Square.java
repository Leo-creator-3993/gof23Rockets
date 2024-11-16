package com.future.rocket.gof23.bridge.struct;

import com.future.rocket.gof23.bridge.iface.DrawSquareApi;
import com.future.rocket.gof23.bridge.struct.base.Shape;

public class Square extends Shape {

    private final DrawSquareApi drawSquareApi;
    private final int height;
    private final int width;

    public Square(DrawSquareApi drawApi, int height, int width) {
        this.drawSquareApi = drawApi;
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        this.drawSquareApi.drawSquare(height, width);
        System.out.println("Completed!");
    }
}

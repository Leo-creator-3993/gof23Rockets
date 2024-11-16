package com.future.rocket.gof23.bridge.impl.square;

import com.future.rocket.gof23.bridge.iface.DrawSquareApi;

public class BlueSquare implements DrawSquareApi {
    @Override
    public void drawSquare(int height, int width) {
        System.out.printf("Drawing BLUE square, height:%s, width:%s%n", height, width);
    }
}

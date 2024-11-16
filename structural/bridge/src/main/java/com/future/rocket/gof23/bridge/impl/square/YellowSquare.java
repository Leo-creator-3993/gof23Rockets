package com.future.rocket.gof23.bridge.impl.square;

import com.future.rocket.gof23.bridge.iface.DrawSquareApi;

public class YellowSquare implements DrawSquareApi {
    @Override
    public void drawSquare(int height, int width) {
        System.out.printf("Drawing YELLOW square, height:%s, width:%s%n", height, width);
    }
}

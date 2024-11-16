package com.future.rocket.gof23.bridge.impl.circle;

import com.future.rocket.gof23.bridge.iface.DrawCircleApi;

public class BlackCircle implements DrawCircleApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.printf("Drawing BLACK circle, radius:%s, x:%s, y:%s%n", radius, x, y);
    }
}

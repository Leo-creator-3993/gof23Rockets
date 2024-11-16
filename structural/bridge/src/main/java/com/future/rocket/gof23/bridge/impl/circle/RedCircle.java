package com.future.rocket.gof23.bridge.impl.circle;

import com.future.rocket.gof23.bridge.iface.DrawCircleApi;

public class RedCircle implements DrawCircleApi {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println(String.format("Drawing RED circle, radius:%s, x:%s, y:%s", radius, x, y));
    }
}

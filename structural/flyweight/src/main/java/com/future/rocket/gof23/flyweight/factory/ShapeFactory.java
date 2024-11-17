package com.future.rocket.gof23.flyweight.factory;

import com.future.rocket.gof23.flyweight.enums.ColorEnum;
import com.future.rocket.gof23.flyweight.iface.Shape;
import com.future.rocket.gof23.flyweight.impl.Circle;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ShapeFactory {

    private static final Map<ColorEnum, Shape> circleMap = new ConcurrentHashMap<>();

    public static Shape getCircle(ColorEnum colorEnum) {
        return circleMap.computeIfAbsent(colorEnum, Circle::new);
    }
}

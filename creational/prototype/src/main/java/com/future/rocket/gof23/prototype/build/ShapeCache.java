package com.future.rocket.gof23.prototype.build;

import com.future.rocket.gof23.prototype.Shape;
import com.future.rocket.gof23.prototype.impl.Circle;
import com.future.rocket.gof23.prototype.impl.Rectangle;
import com.future.rocket.gof23.prototype.impl.Square;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {

    private static Map<Integer, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(int id) {
        Shape shape = shapeMap.get(id);
        return shape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId(1);
        Rectangle rectangle = new Rectangle();
        rectangle.setId(2);
        Square square = new Square();
        square.setId(3);
        shapeMap.put(1, circle);
        shapeMap.put(2, rectangle);
        shapeMap.put(3, square);
    }
}

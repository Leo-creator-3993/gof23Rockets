package com.future.rocket.gof23.factory.build;

import com.future.rocket.gof23.factory.Shape;
import com.future.rocket.gof23.factory.ShapeEnum;
import com.future.rocket.gof23.factory.impl.Circle;
import com.future.rocket.gof23.factory.impl.Rectangle;
import com.future.rocket.gof23.factory.impl.Square;

public class ShapeFactory {

    public Shape getShape(ShapeEnum shapeEnum) {
        if(ShapeEnum.Circle == shapeEnum) {
            return new Circle();
        } else if (ShapeEnum.Square == shapeEnum) {
            return new Square();
        } else if (ShapeEnum.Rectangle == shapeEnum) {
            return new Rectangle();
        }
        return null;
    }
}

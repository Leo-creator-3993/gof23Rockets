package com.future.rocket.gof23.abs.factory.build;

import com.future.rocket.gof23.abs.factory.Shape;
import com.future.rocket.gof23.abs.factory.enums.ShapeEnum;
import com.future.rocket.gof23.abs.factory.impl.Circle;
import com.future.rocket.gof23.abs.factory.impl.Rectangle;
import com.future.rocket.gof23.abs.factory.impl.Square;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(ShapeEnum shapeEnum) {
        if(ShapeEnum.Circle == shapeEnum) {
            return new Circle();
        } else if (ShapeEnum.Rectangle == shapeEnum) {
            return new Rectangle();
        } else if (ShapeEnum.Square == shapeEnum) {
            return new Square();
        }
        return null;
    }
}

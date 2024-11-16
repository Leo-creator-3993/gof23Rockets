package com.future.rocket.gof23.abs.factory.build;

import com.future.rocket.gof23.abs.factory.Shape;
import com.future.rocket.gof23.abs.factory.enums.ShapeEnum;
import com.future.rocket.gof23.abs.factory.impl.RoundedCircle;
import com.future.rocket.gof23.abs.factory.impl.RoundedRectangle;
import com.future.rocket.gof23.abs.factory.impl.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(ShapeEnum shapeEnum) {
        if(ShapeEnum.Circle == shapeEnum) {
            return new RoundedCircle();
        } else if (ShapeEnum.Rectangle == shapeEnum) {
            return new RoundedRectangle();
        } else if (ShapeEnum.Square == shapeEnum) {
            return new RoundedSquare();
        }
        return null;
    }
}

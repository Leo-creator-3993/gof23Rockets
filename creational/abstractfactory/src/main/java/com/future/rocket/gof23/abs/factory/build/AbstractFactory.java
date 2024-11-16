package com.future.rocket.gof23.abs.factory.build;

import com.future.rocket.gof23.abs.factory.Shape;
import com.future.rocket.gof23.abs.factory.enums.ShapeEnum;

public abstract class AbstractFactory {
    public abstract Shape getShape(ShapeEnum shapeEnum);
}

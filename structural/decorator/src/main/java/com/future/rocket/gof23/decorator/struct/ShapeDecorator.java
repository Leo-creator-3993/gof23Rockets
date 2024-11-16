package com.future.rocket.gof23.decorator.struct;

import com.future.rocket.gof23.decorator.iface.Shape;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratorShape;

    public ShapeDecorator (Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

}

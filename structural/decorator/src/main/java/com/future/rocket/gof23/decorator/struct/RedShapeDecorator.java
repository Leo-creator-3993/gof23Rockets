package com.future.rocket.gof23.decorator.struct;

import com.future.rocket.gof23.decorator.iface.Shape;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setColor();
    }

    private void setColor() {
        System.out.println("Set shape to red, doesn't it seen good? ... Cool!");
    }
}

package com.future.rocket.gof23.factory;

import com.future.rocket.gof23.factory.build.ShapeFactory;

public class FactoryPatternMain {

    public static void main(String[] args) {
        System.out.println("hi, gof32 rocket launch...");

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape(ShapeEnum.Circle);
        circle.draw();

        Shape square = shapeFactory.getShape(ShapeEnum.Square);
        square.draw();

        Shape rectangle = shapeFactory.getShape(ShapeEnum.Rectangle);
        rectangle.draw();
    }
}

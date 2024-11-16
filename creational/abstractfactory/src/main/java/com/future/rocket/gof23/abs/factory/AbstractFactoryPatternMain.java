package com.future.rocket.gof23.abs.factory;

import com.future.rocket.gof23.abs.factory.build.AbstractFactory;
import com.future.rocket.gof23.abs.factory.enums.FactoryTypeEnum;
import com.future.rocket.gof23.abs.factory.enums.ShapeEnum;
import com.future.rocket.gof23.abs.factory.producer.FactoryProducer;
import com.future.rocket.gof23.common.OtherTool;

public class AbstractFactoryPatternMain {

    public static void main(String[] args) {
        System.out.println("hi, gof23 rocket running...");
        OtherTool.printSplitLine();

        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory shapeFactory = factoryProducer.getFactory(FactoryTypeEnum.Shape);
        Shape circle = shapeFactory.getShape(ShapeEnum.Circle);
        Shape square = shapeFactory.getShape(ShapeEnum.Square);
        Shape rectangle = shapeFactory.getShape(ShapeEnum.Rectangle);
        circle.draw();
        square.draw();
        rectangle.draw();
        OtherTool.printSplitLine();

        AbstractFactory roundedShapeFactory = factoryProducer.getFactory(FactoryTypeEnum.RoundedShape);
        Shape rCircle = roundedShapeFactory.getShape(ShapeEnum.Circle);
        Shape rSquare = roundedShapeFactory.getShape(ShapeEnum.Square);
        Shape rRectangle = roundedShapeFactory.getShape(ShapeEnum.Rectangle);
        rCircle.draw();
        rRectangle.draw();
        rSquare.draw();
    }
}

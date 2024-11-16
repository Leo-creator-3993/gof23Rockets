package com.future.rocket.gof23.decorator;

import com.future.rocket.gof23.common.OtherTool;
import com.future.rocket.gof23.decorator.iface.Shape;
import com.future.rocket.gof23.decorator.impl.Circle;
import com.future.rocket.gof23.decorator.impl.Rectangle;
import com.future.rocket.gof23.decorator.struct.RedShapeDecorator;

public class DecoratorMain {

    public static void main(String[] args) {
        System.out.println("hi, welcome to gof23 rockets, now we come to decorator house!");
        OtherTool.printSplitLine();

        Shape circle = new Circle();
        circle.draw();
        OtherTool.printSplitLine();

        Shape redShapeDecorator = new RedShapeDecorator(circle);
        redShapeDecorator.draw();
        OtherTool.printSplitLine();

        Shape rectangle = new Rectangle();
        rectangle.draw();
        OtherTool.printSplitLine();
        Shape redShapeDecorator1 = new RedShapeDecorator(rectangle);
        redShapeDecorator1.draw();
    }
}
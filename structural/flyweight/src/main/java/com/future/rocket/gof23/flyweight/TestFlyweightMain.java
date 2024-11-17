package com.future.rocket.gof23.flyweight;

import com.future.rocket.gof23.common.OtherTool;
import com.future.rocket.gof23.flyweight.enums.ColorEnum;
import com.future.rocket.gof23.flyweight.factory.ShapeFactory;
import com.future.rocket.gof23.flyweight.iface.Shape;
import com.future.rocket.gof23.flyweight.impl.Circle;

import java.util.Random;
import java.util.function.Supplier;

public class TestFlyweightMain {

    public static void main(String[] args) {
        ColorEnum[] colorEnums = new ColorEnum[] {
          ColorEnum.BLACK, ColorEnum.BLUE, ColorEnum.PINK, ColorEnum.WHITE, ColorEnum.RED
        };

        for(int i=0; i < 10; i++) {
            Shape shape = ShapeFactory.getCircle(getRandomColor(colorEnums));
            if(shape instanceof Circle) {
                Circle circle = (Circle) shape;
                circle.setX(getRandomX());
                circle.setY(getRandomY());
                circle.setRadius(getRandomRadius());
            }
            shape.draw();
            System.out.println(shape);
            OtherTool.printSplitLine();

        }
    }

    private static int getRandomRadius() {
        return getRandomInt().get();
    }

    private static int getRandomY() {
        return getRandomInt().get();
    }

    private static int getRandomX() {
        return getRandomInt().get();
    }

    private static Supplier<Integer> getRandomInt() {
        return () -> new Random().nextInt();
    }

    private static ColorEnum getRandomColor(ColorEnum[] colorEnums) {
        return colorEnums[new Random().nextInt(5)];
    }
}

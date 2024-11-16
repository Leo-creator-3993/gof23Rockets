package com.future.rocket.gof23.prototype;

import com.future.rocket.gof23.common.OtherTool;
import com.future.rocket.gof23.prototype.build.ShapeCache;

public class PrototypeMain {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape shape1 = ShapeCache.getShape(1);
        Shape shape2 = ShapeCache.getShape(2);
        Shape shape3 = ShapeCache.getShape(3);

        System.out.println("shape1 ==> " + shape1);
        System.out.println("shape2 ==> " + shape2);
        System.out.println("shape3 ==> " + shape3);
        OtherTool.printSplitLine();
        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}

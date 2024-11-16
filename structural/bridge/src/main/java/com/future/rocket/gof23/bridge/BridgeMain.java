package com.future.rocket.gof23.bridge;

import com.future.rocket.gof23.bridge.impl.circle.BlackCircle;
import com.future.rocket.gof23.bridge.impl.circle.GreenCircle;
import com.future.rocket.gof23.bridge.impl.circle.RedCircle;
import com.future.rocket.gof23.bridge.impl.square.BlueSquare;
import com.future.rocket.gof23.bridge.impl.square.YellowSquare;
import com.future.rocket.gof23.bridge.struct.Circle;
import com.future.rocket.gof23.bridge.struct.Square;
import com.future.rocket.gof23.common.OtherTool;

public class BridgeMain {

    public static void main(String[] args) {
        Circle c1 = new Circle(new GreenCircle(), 5,1,2);
        c1.draw();
        OtherTool.printSplitLine();
        Circle c2 = new Circle(new RedCircle(),1,1,1);
        c2.draw();
        OtherTool.printSplitLine();
        Circle c3 = new Circle(new BlackCircle(),3,1,2);
        c3.draw();
        OtherTool.printSplitLine();
        Square s1 = new Square(new BlueSquare(), 10, 20);
        s1.draw();
        OtherTool.printSplitLine();
        Square s2 = new Square(new YellowSquare(), 20, 30);
        s2.draw();
    }
}

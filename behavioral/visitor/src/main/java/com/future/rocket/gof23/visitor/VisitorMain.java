package com.future.rocket.gof23.visitor;

import com.future.rocket.gof23.common.OtherTool;
import com.future.rocket.gof23.visitor.iface.ComputerPart;
import com.future.rocket.gof23.visitor.iface.ComputerPartVisitor;
import com.future.rocket.gof23.visitor.impl.*;

public class VisitorMain {

    public static void main(String[] args) {
        System.out.println("hi, welcome to gof23 rocket, now we in visitor house...");
        OtherTool.printSplitLine();
        ComputerPartVisitor computerPartVisitor = new ComputerPartDisplayVisitor();
        Keyboard keyboard = new Keyboard("LoGi");
        Monitor monitor = new Monitor("Huawei");
        Mouse mouse = new Mouse("Future");
        Line line = new Line("Generic");
        Computer computer = new Computer("Apple", new ComputerPart[]{keyboard, monitor, mouse, line});
        computer.accept(computerPartVisitor);
        OtherTool.printSplitLine();
        keyboard.accept(computerPartVisitor);
    }
}

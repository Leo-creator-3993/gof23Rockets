package com.future.rocket.gof23.template;

import com.future.rocket.gof23.common.OtherTool;
import com.future.rocket.gof23.template.abs.Game;
import com.future.rocket.gof23.template.impl.Basketball;
import com.future.rocket.gof23.template.impl.Football;

public class TemplateMain {

    public static void main(String[] args) {
        System.out.println("hi, welcome to gof23 rocket, now we in template house...");
        OtherTool.printSplitLine();
        Game football = new Football();
        football.play();
        OtherTool.printSplitLine();
        Game basketball = new Basketball();
        basketball.play();
    }
}

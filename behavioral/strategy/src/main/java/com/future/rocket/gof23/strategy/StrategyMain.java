package com.future.rocket.gof23.strategy;

import com.future.rocket.gof23.common.OtherTool;
import com.future.rocket.gof23.strategy.context.Context;
import com.future.rocket.gof23.strategy.impl.OperationAdd;
import com.future.rocket.gof23.strategy.impl.OperationDivide;
import com.future.rocket.gof23.strategy.impl.OperationMultiply;
import com.future.rocket.gof23.strategy.impl.OperationSubstract;

public class StrategyMain {

    public static void main(String[] args) {
        System.out.println("hi, welcome to gof23 rockets, now we in strategy house...");
        OtherTool.printSplitLine();

        Context context = new Context(new OperationAdd());
        int num1 = 42;
        int num2 = 33;
        System.out.println("original number num1: " + num1 + ", num2: " + num2);
        System.out.println("#1 add => " + context.executeStrategy(num1, num2));

        context = new Context(new OperationSubstract());
        System.out.println("#2 sub => " + context.executeStrategy(num1, num2));

        context = new Context(new OperationMultiply());
        System.out.println("#3 mul => " + context.executeStrategy(num1, num2));

        context = new Context(new OperationDivide());
        System.out.println("#3 div => " + context.executeStrategy(num1, num2));
    }
}

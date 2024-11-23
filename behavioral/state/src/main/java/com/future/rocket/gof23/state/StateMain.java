package com.future.rocket.gof23.state;

import com.future.rocket.gof23.common.OtherTool;
import com.future.rocket.gof23.state.iface.State;
import com.future.rocket.gof23.state.impl.*;
import com.future.rocket.gof23.state.info.Context;

public class StateMain {

    public static void main(String[] args) {
        System.out.println("hi, welcome to gof23 rocket, now we in state house...");
        OtherTool.printSplitLine();
        Context context = new Context();
        System.out.println("#first Context==>" + context);
        OtherTool.printSplitLine();

        State startState = new StartState();
        startState.doAction(context);
        System.out.println("#1 ==>" + context.getState());
        startState.doAction(context);
        System.out.println("#2 ==>" + context.getState());
        OtherTool.printSplitLine();

        State stopState = new StopState();
        stopState.doAction(context);
        System.out.println("#3 ==>" + context.getState());
        stopState.doAction(context);
        System.out.println("#4 ==>" + context.getState());
        OtherTool.printSplitLine();
        State upState = new UpState();
        upState.doAction(context);
        System.out.println("#5 ==>" + context.getState());
        OtherTool.printSplitLine();
        State downState = new DownState();
        downState.doAction(context);
        System.out.println("#6 ==>" + context.getState());
        OtherTool.printSplitLine();
        State runState = new RunState();
        runState.doAction(context);
        System.out.println("#7 ==>" + context.getState());
        OtherTool.printSplitLine();
        System.out.println("#end Context==>" + context);
    }
}

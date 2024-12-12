package com.future.rocket.gof23.frontController;

import com.future.rocket.gof23.common.OtherTool;
import com.future.rocket.gof23.frontController.controller.FrontController;
import com.future.rocket.gof23.frontController.enums.RequestType;

public class FrontControllerMain {

    public static void main(String[] args) {
        System.out.println("hi, welcome to gof23 rockets, we now in front controller house...");
        OtherTool.printSplitLine();
        FrontController frontController = new FrontController();
        frontController.dispatchRequest(RequestType.HOME);
        OtherTool.printSplitLine();
        frontController.dispatchRequest(RequestType.FOO);
    }
}

package com.future.rocket.gof23.singleton;

import com.future.rocket.gof23.common.OtherTool;

public class SingletonMain {

    public static void main(String[] args) {
        SingletonObject singletonObject = SingletonObject.getInstance();
        singletonObject.launch();
        OtherTool.printSplitLine();

        LazySingletonObject lazySingletonObject = LazySingletonObject.getInstance();
        lazySingletonObject.launch();
    }
}

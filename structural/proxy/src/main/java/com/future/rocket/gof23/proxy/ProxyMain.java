package com.future.rocket.gof23.proxy;

import com.future.rocket.gof23.common.OtherTool;
import com.future.rocket.gof23.proxy.struct.ProxyImage;

public class ProxyMain {

    public static void main(String[] args) {
        System.out.println("hi, welcome to gof23 rocket, now we in proxy house.");
        OtherTool.printSplitLine();

        ProxyImage proxyImage = new ProxyImage("proxyRocket.png");
        proxyImage.display();
        OtherTool.printSplitLine();
        proxyImage.display();
    }
}

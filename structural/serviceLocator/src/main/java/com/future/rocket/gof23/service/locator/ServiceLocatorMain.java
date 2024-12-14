package com.future.rocket.gof23.service.locator;

import com.future.rocket.gof23.common.OtherTool;
import com.future.rocket.gof23.service.locator.enums.ServiceType;
import com.future.rocket.gof23.service.locator.iface.Service;

public class ServiceLocatorMain {

    public static void main(String[] args) {
        System.out.println("hi, welcome to gof23 rockets, we now in service locator house...");
        OtherTool.printSplitLine();
        ServiceLocator serviceLocator = new ServiceLocator();
        Service service = serviceLocator.getService(ServiceType.FOO);
        service.execute();
        OtherTool.printSplitLine();
        service = serviceLocator.getService(ServiceType.BAR);
        service.execute();
        OtherTool.printSplitLine();
        service = serviceLocator.getService(ServiceType.BAR);
        service.execute();
        OtherTool.printSplitLine();
        service = serviceLocator.getService(ServiceType.FOO);
        service.execute();
    }
}

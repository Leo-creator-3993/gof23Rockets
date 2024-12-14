package com.future.rocket.gof23.service.locator.impl;

import com.future.rocket.gof23.service.locator.enums.ServiceType;
import com.future.rocket.gof23.service.locator.iface.Service;

public class FooService implements Service {

    @Override
    public ServiceType getServiceType() {
        return ServiceType.FOO;
    }

    @Override
    public void execute() {
        System.out.println("# FooService Executing...");
    }
}

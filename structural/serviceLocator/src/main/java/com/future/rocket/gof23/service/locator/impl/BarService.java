package com.future.rocket.gof23.service.locator.impl;

import com.future.rocket.gof23.service.locator.enums.ServiceType;
import com.future.rocket.gof23.service.locator.iface.Service;

public class BarService implements Service {

    @Override
    public ServiceType getServiceType() {
        return ServiceType.BAR;
    }

    @Override
    public void execute() {
        System.out.println("# BarService Executing...");
    }
}

package com.future.rocket.gof23.service.locator.iface;

import com.future.rocket.gof23.service.locator.enums.ServiceType;

public interface Service {
    ServiceType getServiceType();
    void execute();
}

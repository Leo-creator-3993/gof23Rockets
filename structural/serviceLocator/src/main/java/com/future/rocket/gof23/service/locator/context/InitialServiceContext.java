package com.future.rocket.gof23.service.locator.context;

import com.future.rocket.gof23.service.locator.enums.ServiceType;
import com.future.rocket.gof23.service.locator.impl.BarService;
import com.future.rocket.gof23.service.locator.impl.FooService;

public class InitialServiceContext {

    public Object lookup(ServiceType serviceType) {
        if(ServiceType.FOO == serviceType) {
            return new FooService();
        } else if(ServiceType.BAR == serviceType) {
            return new BarService();
        }

        throw new IllegalArgumentException(String.format("Unknown service type %s", serviceType));
    }
}

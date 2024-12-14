package com.future.rocket.gof23.service.locator;

import com.future.rocket.gof23.service.locator.cache.ServiceCache;
import com.future.rocket.gof23.service.locator.context.InitialServiceContext;
import com.future.rocket.gof23.service.locator.enums.ServiceType;
import com.future.rocket.gof23.service.locator.iface.Service;

public class ServiceLocator {
    private final ServiceCache cache;

    public ServiceLocator() {
        this.cache = new ServiceCache();
    }

    public Service getService(ServiceType serviceType) {
        Service service = cache.getService(serviceType);
        if(service != null) {
            System.out.printf("Service [%s] found in cache.%n", serviceType);
            return service;
        }

        InitialServiceContext serviceContext = new InitialServiceContext();
        Service lookupService = (Service) serviceContext.lookup(serviceType);
        cache.addService(lookupService);
        return lookupService;
    }
}

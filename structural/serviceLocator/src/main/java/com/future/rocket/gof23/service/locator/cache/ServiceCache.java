package com.future.rocket.gof23.service.locator.cache;

import com.future.rocket.gof23.service.locator.enums.ServiceType;
import com.future.rocket.gof23.service.locator.iface.Service;

import java.util.HashSet;
import java.util.Set;

public class ServiceCache {

    private final Set<Service> services;

    public ServiceCache() {
        this.services = new HashSet<>();
    }

    public void addService(Service service) {
        this.services.add(service);
    }

    public Service getService(ServiceType serviceType) {
        for (Service service : services) {
            if (service.getServiceType() == serviceType) {
                return service;
            }
        }
        return null;
    }
}

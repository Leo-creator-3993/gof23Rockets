package com.future.rocket.gof23.business.delegate.delegate;

import com.future.rocket.gof23.business.delegate.enums.ServiceType;
import com.future.rocket.gof23.business.delegate.iface.BusinessService;
import com.future.rocket.gof23.business.delegate.lookup.BusinessLookup;

public class BusinessDelegate {
    private final BusinessLookup businessLookup = new BusinessLookup();
    private ServiceType serviceType;

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        BusinessService businessService = businessLookup.lookupBusinessService(serviceType);
        businessService.doProcessing();
    }
}

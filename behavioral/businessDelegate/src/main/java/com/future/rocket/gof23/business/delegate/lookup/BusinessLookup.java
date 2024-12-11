package com.future.rocket.gof23.business.delegate.lookup;

import com.future.rocket.gof23.business.delegate.enums.ServiceType;
import com.future.rocket.gof23.business.delegate.iface.BusinessService;
import com.future.rocket.gof23.business.delegate.impl.EJBService;
import com.future.rocket.gof23.business.delegate.impl.JMSService;

public class BusinessLookup {

    public BusinessService lookupBusinessService(ServiceType serviceType) {
        switch (serviceType) {
            case EJB:
                return new EJBService();
            case JMS:
                return new JMSService();
            default:
                return null;
        }
    }
}

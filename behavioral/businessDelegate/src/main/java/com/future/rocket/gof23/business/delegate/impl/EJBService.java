package com.future.rocket.gof23.business.delegate.impl;

import com.future.rocket.gof23.business.delegate.iface.BusinessService;

public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("## ==> EJBService doProcessing");
    }
}
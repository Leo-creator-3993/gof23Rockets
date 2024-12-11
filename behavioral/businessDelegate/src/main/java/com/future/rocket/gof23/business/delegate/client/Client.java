package com.future.rocket.gof23.business.delegate.client;

import com.future.rocket.gof23.business.delegate.delegate.BusinessDelegate;

public class Client {
    private BusinessDelegate businessDelegate;
    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    public void doProcessing() {
        businessDelegate.doTask();
    }
}

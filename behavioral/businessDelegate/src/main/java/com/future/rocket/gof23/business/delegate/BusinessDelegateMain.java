package com.future.rocket.gof23.business.delegate;

import com.future.rocket.gof23.business.delegate.client.Client;
import com.future.rocket.gof23.business.delegate.delegate.BusinessDelegate;
import com.future.rocket.gof23.business.delegate.enums.ServiceType;
import com.future.rocket.gof23.common.OtherTool;

public class BusinessDelegateMain {

    public static void main(String[] args) {
        System.out.println("hi, welcome to gof23 rockets, we now in business delegate house...");
        OtherTool.printSplitLine();
        BusinessDelegate businessDelegate = new BusinessDelegate();
        Client client = new Client(businessDelegate);
        businessDelegate.setServiceType(ServiceType.EJB);
        client.doProcessing();
        OtherTool.printSplitLine();
        businessDelegate.setServiceType(ServiceType.JMS);
        client.doProcessing();
    }
}

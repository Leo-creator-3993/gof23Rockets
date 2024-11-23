package com.future.rocket.gof23.nullobject.factory;

import com.future.rocket.gof23.nullobject.iface.AbstractCustomer;
import com.future.rocket.gof23.nullobject.impl.NullCustomer;
import com.future.rocket.gof23.nullobject.impl.RealCustomer;

import java.util.Arrays;
import java.util.List;

public class CustomerFactory {

    private static final List<String> registerUserName = Arrays.asList("leo", "foo", "bar");

    public static AbstractCustomer getCustomer(String name) {
        if (registerUserName.contains(name)) {
            return new RealCustomer(name);
        }

        return new NullCustomer(name);
    }
}

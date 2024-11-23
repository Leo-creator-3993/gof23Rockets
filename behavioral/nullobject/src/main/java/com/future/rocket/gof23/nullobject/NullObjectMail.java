package com.future.rocket.gof23.nullobject;

import com.future.rocket.gof23.common.OtherTool;
import com.future.rocket.gof23.nullobject.factory.CustomerFactory;
import com.future.rocket.gof23.nullobject.iface.AbstractCustomer;

public class NullObjectMail {
    public static void main(String[] args) {
        System.out.println("hi, welcome to gof23 rockets, now we in null object house...");
        OtherTool.printSplitLine();
        AbstractCustomer leo = CustomerFactory.getCustomer("leo");
        AbstractCustomer john = CustomerFactory.getCustomer("john");
        AbstractCustomer foo = CustomerFactory.getCustomer("foo");
        AbstractCustomer bar = CustomerFactory.getCustomer("bar");
        AbstractCustomer baz = CustomerFactory.getCustomer("baz");

        System.out.println(leo.getName());
        System.out.println(john.getName());
        System.out.println(foo.getName());
        System.out.println(bar.getName());
        System.out.println(baz.getName());
    }
}

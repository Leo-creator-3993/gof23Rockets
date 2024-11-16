package com.future.rocket.gof23.composite;

import com.future.rocket.gof23.common.OtherTool;

public class CompositeMain {
    public static void main(String[] args) {
        System.out.println("hi, gof23 rocket launching now...");
        OtherTool.printSplitLine();
        Employee ee = new Employee("ee", "ee", 100);
        Employee e1 = new Employee("e1", "e1", 10);
        Employee e2 = new Employee("e2", "e2", 5);
        Employee e3 = new Employee("e3", "e3", 3);
        Employee e4 = new Employee("e4", "e4", 2);

        ee.addSubordinate(e1);
        ee.addSubordinate(e2);
        ee.addSubordinate(e3);
        ee.addSubordinate(e4);
        System.out.println(ee.getSubordinates());
        OtherTool.printSplitLine();
        e1.addSubordinate(e3);
        e1.addSubordinate(e4);
        System.out.println(e1.getSubordinates());
        OtherTool.printSplitLine();
        Employee x = new Employee("x", "x", 0);
        x.addSubordinate(ee);
        x.addSubordinate(e1);
        for(Employee e : x.getSubordinates()) {
            System.out.println("e ==> " + e);
            for(Employee ei : e.getSubordinates()) {
                System.out.println("ei ==> " + ei);
            }
        }
    }
}

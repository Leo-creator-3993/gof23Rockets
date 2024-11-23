package com.future.rocket.gof23.iterator;

import com.future.rocket.gof23.common.OtherTool;
import com.future.rocket.gof23.iterator.iface.Iterator;
import com.future.rocket.gof23.iterator.impl.ConcreteAggregate;

public class IteratorMain {

    public static void main(String[] args) {
        System.out.println("hi, welcome to gof23 rocket, now we in iterator house...");
        OtherTool.printSplitLine();
        String[] items = new String[]{"day","etc", "blue", "lake", "boat", "tree"};
        Iterator<String> iterator = new ConcreteAggregate<>(items).createIterator();
        while (iterator.hasNext()) {
            System.out.println("==> item: " + iterator.next());
        }

        OtherTool.printSplitLine();
        Integer[] arr = new Integer[]{1,2,3,4,5,6,7,8,9};
        Iterator<Integer> it = new ConcreteAggregate<>(arr).createIterator();
        while (it.hasNext()) {
            System.out.println("### item: " + it.next());
        }
    }
}

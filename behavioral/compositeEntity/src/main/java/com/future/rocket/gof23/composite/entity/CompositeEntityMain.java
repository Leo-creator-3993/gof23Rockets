package com.future.rocket.gof23.composite.entity;

import com.future.rocket.gof23.common.OtherTool;
import com.future.rocket.gof23.composite.entity.client.Client;
import com.future.rocket.gof23.composite.entity.composite.CompositeEntity;
import com.future.rocket.gof23.composite.entity.dependency.CoarseGrainedObject;

public class CompositeEntityMain {
    public static void main(String[] args) {
        System.out.println("hi, welcome to gof23 rockets, we now in composite entity house...");
        OtherTool.printSplitLine();
        CoarseGrainedObject coarseGrainedObject = new CoarseGrainedObject();
        CompositeEntity composite = new CompositeEntity(coarseGrainedObject);
        Client client = new Client(composite);
        client.setData(new String[]{"hope", "life"});
        client.printData();
        OtherTool.printSplitLine();
        client.setData(new String[]{"day", "up"});
        client.printData();
    }
}

package com.future.rocket.gof23.composite.entity.composite;

import com.future.rocket.gof23.composite.entity.dependency.CoarseGrainedObject;

public class CompositeEntity {
    private CoarseGrainedObject coarseGrainedObject;

    public CompositeEntity(CoarseGrainedObject coarseGrainedObject) {
        this.coarseGrainedObject = coarseGrainedObject;
    }

    public void setData(String data1, String data2) {
        this.coarseGrainedObject.setData(data1, data2);
    }

    public String[] getData() {
        return this.coarseGrainedObject.getData();
    }
}
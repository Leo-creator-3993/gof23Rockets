package com.future.rocket.gof23.composite.entity.client;

import com.future.rocket.gof23.composite.entity.composite.CompositeEntity;

public class Client {
    private CompositeEntity compositeEntity;
    public Client(CompositeEntity compositeEntity) {
        this.compositeEntity = compositeEntity;
    }

    public void printData() {
        String[] data = this.compositeEntity.getData();
        for (int i = 0; i < data.length; i++) {
            System.out.println("Data Item:" + data[i]);
        }
    }

    public void setData(String[] data) {
        if(data != null && data.length != 2) {
            throw new IllegalArgumentException("非法参数, 要求数组元素为2");
        }

        this.compositeEntity.setData(data[0], data[1]);
    }
}
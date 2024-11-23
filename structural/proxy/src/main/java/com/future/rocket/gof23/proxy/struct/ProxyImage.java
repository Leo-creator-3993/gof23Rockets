package com.future.rocket.gof23.proxy.struct;

import com.future.rocket.gof23.proxy.impl.RealImage;

public class ProxyImage {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if(realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

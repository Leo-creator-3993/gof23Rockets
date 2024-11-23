package com.future.rocket.gof23.proxy.impl;

import com.future.rocket.gof23.proxy.iface.Image;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println(String.format("Loading file ==> %s from disk...", fileName));
    }

    @Override
    public void display() {
        System.out.println("Displaying file ==> " + fileName);
    }
}

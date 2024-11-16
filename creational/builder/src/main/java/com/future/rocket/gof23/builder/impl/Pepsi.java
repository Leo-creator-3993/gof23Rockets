package com.future.rocket.gof23.builder.impl;

public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public double price() {
        return 2.99;
    }
}

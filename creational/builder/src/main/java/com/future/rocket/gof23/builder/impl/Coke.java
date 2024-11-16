package com.future.rocket.gof23.builder.impl;

public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public double price() {
        return 3.99;
    }
}

package com.future.rocket.gof23.builder.impl;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public double price() {
        return 15.99;
    }
}

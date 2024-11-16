package com.future.rocket.gof23.builder.impl;

public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public double price() {
        return 25.99;
    }
}

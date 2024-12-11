package com.future.rocket.gof23.template.impl;

import com.future.rocket.gof23.template.abs.Game;

public class Football extends Game {
    @Override
    protected void initialize() {
        System.out.println("Football initialized.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Leo and his partner playing football...");
    }

    @Override
    protected void endPlay() {
        System.out.println("Football end playing.");
    }
}

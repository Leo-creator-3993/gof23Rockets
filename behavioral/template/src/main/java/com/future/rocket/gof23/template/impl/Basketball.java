package com.future.rocket.gof23.template.impl;

import com.future.rocket.gof23.template.abs.Game;

public class Basketball extends Game {
    @Override
    protected void initialize() {
        System.out.println("Basketball initialize.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Foo and his classmate playing basketball.");
    }

    @Override
    protected void endPlay() {
        System.out.println("Basketball end playing.");
    }
}

package com.future.rocket.gof23.mediator.colleague;

import com.future.rocket.gof23.mediator.iface.ChatMediator;

public abstract class User {
    protected String name;
    protected ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}

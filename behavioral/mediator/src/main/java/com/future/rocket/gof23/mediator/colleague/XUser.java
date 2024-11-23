package com.future.rocket.gof23.mediator.colleague;

import com.future.rocket.gof23.mediator.iface.ChatMediator;

import java.util.Date;

public class XUser extends User {

    public XUser(String name, ChatMediator chatMediator) {
        super(name, chatMediator);
    }

    @Override
    public void send(String message) {
        System.out.println(String.format("%s【%s】sends: %s", new Date(), name, message));
        chatMediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(String.format("%s【%s】receives: %s", new Date(), name, message));
    }
}

package com.future.rocket.gof23.mediator.impl;

import com.future.rocket.gof23.mediator.colleague.User;
import com.future.rocket.gof23.mediator.iface.ChatMediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (u != user) {
                u.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}

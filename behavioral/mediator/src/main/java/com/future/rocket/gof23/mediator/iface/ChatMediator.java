package com.future.rocket.gof23.mediator.iface;

import com.future.rocket.gof23.mediator.colleague.User;

public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}

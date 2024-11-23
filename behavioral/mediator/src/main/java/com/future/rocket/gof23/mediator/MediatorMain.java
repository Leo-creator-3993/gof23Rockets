package com.future.rocket.gof23.mediator;

import com.future.rocket.gof23.common.OtherTool;
import com.future.rocket.gof23.mediator.colleague.User;
import com.future.rocket.gof23.mediator.colleague.XUser;
import com.future.rocket.gof23.mediator.iface.ChatMediator;
import com.future.rocket.gof23.mediator.impl.ChatRoom;

public class MediatorMain {

    public static void main(String[] args) {
        System.out.println("hi, welcome to gof23 rockets, now we in mediator house...");
        OtherTool.printSplitLine();
        ChatMediator chatMediator = new ChatRoom();

        User leo = new XUser("leo", chatMediator);
        User foo = new XUser("foo", chatMediator);
        User lin = new XUser("lin", chatMediator);

        chatMediator.addUser(leo);
        chatMediator.addUser(foo);
        chatMediator.addUser(lin);

        leo.send("Hi, every body! today is a raining day");
        foo.send("I love raining day, haha...");
        lin.send("Raining day will make some trouble to outside");
    }
}

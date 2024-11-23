package com.future.rocket.gof23.memento;

import com.future.rocket.gof23.common.OtherTool;

public class MementoMain {
    public static void main(String[] args) {
        System.out.println("hi, welcome to gof23 rockets, we in memento house now...");
        OtherTool.printSplitLine();

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("State#1");
        originator.setState("State#2");
        originator.setState("State#3");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State#4");
        originator.setState("State#5");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State#6");
        OtherTool.printSplitLine();
        System.out.println("Current state: " + originator.getState());
        caretaker.add(originator.saveStateToMemento());
        OtherTool.printSplitLine();

        //restore states
        caretaker.getMementoList()
                .forEach(memento -> System.out.println(memento.getState()));
    }
}

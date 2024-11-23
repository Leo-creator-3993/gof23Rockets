package com.future.rocket.gof23.memento;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
        System.out.println("set state to " + state);
    }

    public Memento saveStateToMemento() {
        System.out.println("Saving state to memento: " + state);
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
        System.out.println("Restore state from memento: " + state);
    }
}

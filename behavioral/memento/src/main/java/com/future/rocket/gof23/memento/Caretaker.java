package com.future.rocket.gof23.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private final List<Memento> mementoList = new ArrayList<>();
    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }

    public List<Memento> getMementoList() {
        return mementoList;
    }
}

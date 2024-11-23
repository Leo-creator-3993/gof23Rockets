package com.future.rocket.gof23.iterator.impl;

import com.future.rocket.gof23.iterator.iface.Aggregate;
import com.future.rocket.gof23.iterator.iface.Iterator;

public class ConcreteAggregate<T> implements Aggregate<T> {
    private final T[] items;

    public ConcreteAggregate(T[] items) {
        this.items = items;
    }

    @Override
    public Iterator<T> createIterator() {
        return new CommonIteratorImpl<>(items);
    }
}

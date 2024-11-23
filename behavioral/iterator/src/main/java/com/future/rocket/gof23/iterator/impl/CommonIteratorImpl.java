package com.future.rocket.gof23.iterator.impl;

import com.future.rocket.gof23.iterator.iface.Iterator;

public class CommonIteratorImpl<T> implements Iterator<T> {
    private final T[] items;
    private int position = 0;

    public CommonIteratorImpl(T[] t) {
        this.items = t;
    }

    @Override
    public boolean hasNext() {
        return position < items.length;
    }

    @Override
    public T next() {
        return items[position++];
    }
}

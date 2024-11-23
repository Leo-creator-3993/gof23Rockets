package com.future.rocket.gof23.iterator.iface;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}

package com.future.rocket.gof23.command.invoker;

import com.future.rocket.gof23.command.iface.Order;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private final List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void placeOrder() {
        orders.forEach(Order::execute);
    }
}

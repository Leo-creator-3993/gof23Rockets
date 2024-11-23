package com.future.rocket.gof23.command.impl;

import com.future.rocket.gof23.command.iface.Order;
import com.future.rocket.gof23.command.receiver.Stock;

public class SellStock implements Order {
    private final Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}

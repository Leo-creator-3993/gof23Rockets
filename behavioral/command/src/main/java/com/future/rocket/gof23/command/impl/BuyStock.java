package com.future.rocket.gof23.command.impl;

import com.future.rocket.gof23.command.iface.Order;
import com.future.rocket.gof23.command.receiver.Stock;

public class BuyStock implements Order {
    private final Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}

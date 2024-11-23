package com.future.rocket.gof23.command.receiver;

public class Stock {
    private final String name;
    private final int quantity;
    private double price;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.price = 9.99;
    }

    public void buy() {
        System.out.println(String.format("==> Leo bought【%s】,【%d】shares, price【%s】", name, quantity, price));
    }

    public void sell() {
        System.out.println(String.format("==> Leo sell【%s】,【%d】shares, price【%s】", name, quantity, price));
    }

    public void updateStockPrice() {
        System.out.println(String.format("【%s】price now is【%s】", name, price));
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

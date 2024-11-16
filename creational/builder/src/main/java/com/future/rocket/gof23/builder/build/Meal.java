package com.future.rocket.gof23.builder.build;

import com.future.rocket.gof23.builder.iface.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items;

    public Meal() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double getCost() {
        return items.stream().mapToDouble(Item::price).sum();
    }

    public void showItems() {
        for(Item item : items) {
            System.out.print("==> name:" + item.name());
            System.out.print(",packing: " + item.packing().pack());
            System.out.println(", price: " + item.price());
        }
    }
}

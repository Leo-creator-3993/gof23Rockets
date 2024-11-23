package com.future.rocket.gof23.command;

import com.future.rocket.gof23.command.impl.BuyStock;
import com.future.rocket.gof23.command.impl.SellStock;
import com.future.rocket.gof23.command.impl.UpdateStock;
import com.future.rocket.gof23.command.invoker.Broker;
import com.future.rocket.gof23.command.receiver.Stock;
import com.future.rocket.gof23.common.OtherTool;

public class CommandMain {

    public static void main(String[] args) {
        System.out.println("hi, welcome to gof23 rocket, now we in command house...");
        OtherTool.printSplitLine();

        Stock s1 = new Stock("futureRocket", 1999);
        BuyStock b1 = new BuyStock(s1);
        SellStock ss1 = new SellStock(s1);
        UpdateStock u1 = new UpdateStock(s1);

        Broker bk1 = new Broker();
        bk1.addOrder(b1);
        bk1.addOrder(ss1);
        bk1.addOrder(u1);
        bk1.placeOrder();
        OtherTool.printSplitLine();
        s1.setPrice(10.99);
        bk1.placeOrder();

    }
}

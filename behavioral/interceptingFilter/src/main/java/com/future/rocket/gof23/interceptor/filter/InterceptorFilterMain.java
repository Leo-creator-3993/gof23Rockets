package com.future.rocket.gof23.interceptor.filter;

import com.future.rocket.gof23.common.OtherTool;
import com.future.rocket.gof23.interceptor.filter.client.Client;
import com.future.rocket.gof23.interceptor.filter.impl.AuthenticationFilter;
import com.future.rocket.gof23.interceptor.filter.impl.DebugFilter;
import com.future.rocket.gof23.interceptor.filter.manager.FilterManager;
import com.future.rocket.gof23.interceptor.filter.target.Target;

public class InterceptorFilterMain {

    public static void main(String[] args) {
        System.out.println("hi, welcome to gof23 rockets, we now in intercepting filter house...");
        OtherTool.printSplitLine();
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("FOO");
    }
}

package com.future.rocket.gof23.interceptor.filter.impl;

import com.future.rocket.gof23.interceptor.filter.iface.Filter;

public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("DebugFilter executing..." + request);
    }
}

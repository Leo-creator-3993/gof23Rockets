package com.future.rocket.gof23.interceptor.filter.client;

import com.future.rocket.gof23.interceptor.filter.manager.FilterManager;

public class Client {
    private FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}

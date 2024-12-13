package com.future.rocket.gof23.interceptor.filter.manager;

import com.future.rocket.gof23.interceptor.filter.chain.FilterChain;
import com.future.rocket.gof23.interceptor.filter.iface.Filter;
import com.future.rocket.gof23.interceptor.filter.target.Target;

public class FilterManager {
    private FilterChain filterChain;

    public FilterManager(Target target) {
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request) {
        filterChain.execute(request);
    }
}

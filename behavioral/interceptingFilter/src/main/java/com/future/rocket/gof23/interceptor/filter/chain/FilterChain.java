package com.future.rocket.gof23.interceptor.filter.chain;

import com.future.rocket.gof23.interceptor.filter.iface.Filter;
import com.future.rocket.gof23.interceptor.filter.target.Target;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private final List<Filter> filters;
    private Target target;

    public FilterChain() {
        this.filters = new ArrayList<>();
        this.target = new Target();
    }

    public void addFilter(Filter filter) {
        this.filters.add(filter);
    }

    public void execute(String request) {
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}

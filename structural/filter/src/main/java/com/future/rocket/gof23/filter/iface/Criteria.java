package com.future.rocket.gof23.filter.iface;

import com.future.rocket.gof23.filter.struct.Person;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}

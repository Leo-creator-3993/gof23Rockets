package com.future.rocket.gof23.filter.impl;

import com.future.rocket.gof23.filter.iface.Criteria;
import com.future.rocket.gof23.filter.struct.Person;

import java.util.List;

public class AndCriteria implements Criteria {

    private Criteria thisCriteria;
    private Criteria thatCriteria;

    public AndCriteria(Criteria thisCriteria, Criteria thatCriteria) {
        this.thisCriteria = thisCriteria;
        this.thatCriteria = thatCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> first = thisCriteria.meetCriteria(persons);
        return thatCriteria.meetCriteria(first);
    }
}

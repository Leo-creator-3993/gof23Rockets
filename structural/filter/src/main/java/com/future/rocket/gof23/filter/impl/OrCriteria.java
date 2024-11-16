package com.future.rocket.gof23.filter.impl;

import com.future.rocket.gof23.filter.iface.Criteria;
import com.future.rocket.gof23.filter.struct.Person;

import java.util.List;

public class OrCriteria implements Criteria {

    private final Criteria thisCriteria;
    private final Criteria thatCriteria;

    public OrCriteria(Criteria thisCriteria, Criteria thatCriteria) {
        this.thisCriteria = thisCriteria;
        this.thatCriteria = thatCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = thisCriteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = thatCriteria.meetCriteria(persons);
        for (Person person : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}

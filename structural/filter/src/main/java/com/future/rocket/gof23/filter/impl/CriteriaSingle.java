package com.future.rocket.gof23.filter.impl;

import com.future.rocket.gof23.filter.enums.MaritalStatus;
import com.future.rocket.gof23.filter.iface.Criteria;
import com.future.rocket.gof23.filter.struct.Person;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons
                .stream()
                .filter(person -> MaritalStatus.SINGLE == person.getMaritalStatus())
                .collect(Collectors.toList());
    }
}

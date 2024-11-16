package com.future.rocket.gof23.filter.impl;

import com.future.rocket.gof23.filter.enums.Gender;
import com.future.rocket.gof23.filter.iface.Criteria;
import com.future.rocket.gof23.filter.struct.Person;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
       return persons
               .stream()
               .filter(person -> Gender.MALE == person.getGender())
               .collect(Collectors.toList());
    }
}

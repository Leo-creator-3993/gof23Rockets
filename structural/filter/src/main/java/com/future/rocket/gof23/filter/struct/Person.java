package com.future.rocket.gof23.filter.struct;

import com.future.rocket.gof23.filter.enums.Gender;
import com.future.rocket.gof23.filter.enums.MaritalStatus;

public class Person {
    private final String name;
    private final Gender gender;
    private final MaritalStatus maritalStatus;

    public Person(String name, Gender gender, MaritalStatus maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", maritalStatus=" + maritalStatus +
                '}';
    }
}

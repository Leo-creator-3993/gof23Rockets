package com.future.rocket.gof23.filter;

import com.future.rocket.gof23.filter.enums.Gender;
import com.future.rocket.gof23.filter.enums.MaritalStatus;
import com.future.rocket.gof23.filter.iface.Criteria;
import com.future.rocket.gof23.filter.impl.*;
import com.future.rocket.gof23.filter.struct.Person;

import java.util.ArrayList;
import java.util.List;

public class FilterMain {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert", Gender.MALE, MaritalStatus.SINGLE));
        persons.add(new Person("John", Gender.MALE, MaritalStatus.MARRIED));
        persons.add(new Person("Laura", Gender.FEMALE, MaritalStatus.MARRIED));
        persons.add(new Person("Diana", Gender.FEMALE, MaritalStatus.SINGLE));
        persons.add(new Person("Mike", Gender.MALE,MaritalStatus.SINGLE));
        persons.add(new Person("Bobby", Gender.MALE, MaritalStatus.SINGLE));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){

        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
        }
    }
}


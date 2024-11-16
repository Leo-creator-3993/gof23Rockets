package com.future.rocket.gof23.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private String station;
    private double salary;
    private List<Employee> subordinates;

    public Employee(String name, String station, double salary) {
        this.name = name;
        this.station = station;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    public void removeSubordinate(Employee employee) {
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return this.subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", station='" + station + '\'' +
                '}';
    }
}

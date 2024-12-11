package com.future.rocket.gof23.dao.model;

import java.util.Random;

public class Student {
    private String name;
    private int age;
    private int id;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = new Random().nextInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}

package com.future.rocket.gof23.dao.iface;

import com.future.rocket.gof23.dao.model.Student;

import java.util.List;

public interface StudentDao {

    List<Student> findAll();

    void update(Student student);

    void delete(List<String> nameList);

    void insert(List<Student> students);
}

package com.future.rocket.gof23.dao.impl;

import com.future.rocket.gof23.dao.iface.StudentDao;
import com.future.rocket.gof23.dao.model.Student;

import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private List<Student> studentList;
    public StudentDaoImpl(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public void update(Student student) {
        Student std0 = getStudent(student);
        if (std0 != null) {
            std0.setName(student.getName());
        } else {
            studentList.add(student);
        }
    }

    @Override
    public void delete(List<String> nameList) {
        for (String name : nameList) {
            studentList.removeIf(student -> student.getName().equals(name));
        }
    }

    @Override
    public void insert(List<Student> students) {
        students.forEach(this::update);
    }

    private Student getStudent(Student student) {
        for(Student s : studentList) {
            if(s.getId() == student.getId()) {
                return s;
            }
        }
        return null;
    }
}

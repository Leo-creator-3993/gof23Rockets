package com.future.rocket.gof23.mvc.controller;

import com.future.rocket.gof23.mvc.model.Student;
import com.future.rocket.gof23.mvc.view.StudentView;

public class StudentController {

    private final Student student;
    private final StudentView studentView;

    public StudentController(Student student, StudentView studentView) {
        this.student = student;
        this.studentView = studentView;
    }

    public void setStudentName(String studentName) {
        this.student.setName(studentName);
    }

    public String getStudentName() {
        return student.getName();
    }

    public int getStudentAge() {
        return student.getAge();
    }

    public void setStudentAge(int age) {
        this.student.setAge(age);
    }

    public void updateView() {
        studentView.printStudentInfo(student.getName(), student.getAge());
    }
}

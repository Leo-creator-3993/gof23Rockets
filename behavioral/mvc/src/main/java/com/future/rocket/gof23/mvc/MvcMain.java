package com.future.rocket.gof23.mvc;

import com.future.rocket.gof23.common.OtherTool;
import com.future.rocket.gof23.mvc.controller.StudentController;
import com.future.rocket.gof23.mvc.model.Student;
import com.future.rocket.gof23.mvc.view.StudentView;

public class MvcMain {

    public static void main(String[] args) {
        System.out.println("hi, welcome to gof23 rockets, we now in mvc house...");
        OtherTool.printSplitLine();
        Student student = retriedDataFromDb();
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(student, studentView);
        studentController.updateView();
    }

    private static Student retriedDataFromDb() {
        Student student = new Student();
        student.setAge(20);
        student.setName("Leo");
        return student;
    }
}

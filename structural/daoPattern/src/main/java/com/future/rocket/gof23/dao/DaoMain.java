package com.future.rocket.gof23.dao;

import com.future.rocket.gof23.common.OtherTool;
import com.future.rocket.gof23.dao.iface.StudentDao;
import com.future.rocket.gof23.dao.impl.StudentDaoImpl;
import com.future.rocket.gof23.dao.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DaoMain {
    public static void main(String[] args) {
        System.out.println("hi, welcome to gof23 rockets, we now in dao house...");
        OtherTool.printSplitLine();

        List<Student> studentList = new ArrayList<>(Arrays.asList(new Student("leo", 18), new Student("foo", 19), new Student("bar", 20)));
        StudentDao studentDao = new StudentDaoImpl(studentList);
        List<Student> allStudents = studentDao.findAll();
        System.out.println("allStudents: " + allStudents);
        OtherTool.printSplitLine();
        studentDao.insert(Arrays.asList(new Student("yao", 18), new Student("lin", 20)));
        System.out.println("#1 allStudents: " + studentDao.findAll());
        OtherTool.printSplitLine();
        studentDao.delete(Arrays.asList("bar", "foo", "bar","yao"));
        System.out.println("#2 allStudents: " + studentDao.findAll());
        OtherTool.printSplitLine();
    }
}

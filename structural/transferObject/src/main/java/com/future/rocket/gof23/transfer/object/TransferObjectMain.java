package com.future.rocket.gof23.transfer.object;

import com.future.rocket.gof23.common.OtherTool;

public class TransferObjectMain {

    public static void main(String[] args) {
        System.out.println("hi, welcome to gof23 rockets, we now in transferObject house...");
        OtherTool.printSplitLine();
        StudentBO studentBO = new StudentBO();
        System.out.println(studentBO.getAllStudents());
        OtherTool.printSplitLine();
        studentBO.addStudent(new StudentVO(88, "Li"));
        System.out.println(studentBO.getAllStudents());
        OtherTool.printSplitLine();
        studentBO.updateStudent(new StudentVO(88, "Zhang"));
        System.out.println(studentBO.getAllStudents());
        OtherTool.printSplitLine();
        studentBO.deleteStudent(88);
        System.out.println(studentBO.getAllStudents());
    }
}

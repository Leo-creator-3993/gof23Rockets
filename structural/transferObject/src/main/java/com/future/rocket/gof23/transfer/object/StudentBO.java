package com.future.rocket.gof23.transfer.object;

import java.util.HashSet;
import java.util.Set;

public class StudentBO {

    private Set<StudentVO> students;

    public StudentBO() {
        students = new HashSet<>();
        students.add(new StudentVO(33, "foo"));
        students.add(new StudentVO(42, "leo"));
        students.add(new StudentVO(99, "ming"));
    }

    public Set<StudentVO> getAllStudents() {
        return students;
    }

    public void addStudent(StudentVO student) {
        students.add(student);
    }

    public void deleteStudent(int id) {
        students.removeIf(studentVO -> studentVO.getId() == id);
    }

    public void updateStudent(StudentVO student) {
        for (StudentVO studentVO : students) {
            if (studentVO.getId() == student.getId()) {
                studentVO.setName(student.getName());
            }
        }
    }
}

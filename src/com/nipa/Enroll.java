package com.nipa;

import java.util.HashMap;


public class Enroll {

    private HashMap<String, String> enrollStudent = new HashMap<>();

    public void enrollStudent(String registerNumber, String specialization) {
        enrollStudent.put(registerNumber, specialization);
    }

    public void displayEnrolledStudents() {

        for (HashMap.Entry<String, String> student : enrollStudent.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());
        }
    }
}

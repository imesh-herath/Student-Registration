package com.nipa;

public class Main {

    public static void main(String[] args) {
        Weekend student1 = new Weekend();
        student1.addDetails("Jane", "Malabe", 'F', 1990, "DS", "QA");
        String studentID = student1.generateID();
        student1.addMark(56, 34, 12, 46, 78);
        student1.showDetails();
        System.out.println("Student ID " + studentID);
        System.out.println();

        Weekday student2 = new Weekday();
        student2.addDetails("Jim", "Kalutara", 'M', 1991, "SE", "Tuesday");
        String studentID2 = student2.generateID();
        student2.addMark(78, 89, 45, 87, 90);
        student2.showDetails();
        System.out.println("Student ID " + studentID2);

        Enroll sem1 = new Enroll();
        sem1.enrollStudent(studentID, "IT");
        sem1.enrollStudent(studentID2, "SE");
        System.out.println("\n\nEnrolled Student Details");
        sem1.displayEnrolledStudents();

        Specialization spe = new Specialization();
        spe.addSpecialization("SE", 2.75);
        spe.addSpecialization("DS", 3.5);

    }
}

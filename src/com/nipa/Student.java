package com.nipa;
import java.util.Random;



public class Student implements RegisterNumber {

    private String nameOfTheStudent;
    private String addressOfTheStudent;
    private char genderOfTheStudent;
    private int birthYearOfTheStudent;
    private String specializationOfTheStudent;
    int[] Marks = new int[5];

    String registerNumber;

    public void addDetails(String nameOfTheStudent, String addressOfTheStudent, char genderOfTheStudent, int birthYearOfTheStudent, String specializationOfTheStudent) {
        this.nameOfTheStudent = nameOfTheStudent;
        this.addressOfTheStudent = addressOfTheStudent;
        this.genderOfTheStudent = genderOfTheStudent;
        this.birthYearOfTheStudent = birthYearOfTheStudent;
        this.specializationOfTheStudent = specializationOfTheStudent;
    }

    public void addMark(int mark1, int mark2, int mark3, int mark4, int mark5) {
        Marks[0] = mark1;
        Marks[1] = mark2;
        Marks[2] = mark3;
        Marks[3] = mark4;
        Marks[4] = mark5;
    }

    @Override
    public void showDetails() {
        System.out.println("Student Name " + nameOfTheStudent);
        System.out.println("Student Address " + addressOfTheStudent);
        System.out.println("Student Gender " + genderOfTheStudent);
        System.out.println("Student Year " + birthYearOfTheStudent);
        System.out.println("Student Specialization " + specializationOfTheStudent);
    }

    @Override
    public String generateID() {
        while (true) {
            try {
                Random rand = new Random();
                int intRandom = rand.nextInt(9999);
                registerNumber = "IT" + intRandom;

                if (registerNumber.length() < 6) {
                    throw new IDInvalidException("Invalid Register Number!!");
                } else {
                    break;
                }
            } catch (IDInvalidException ex) {
                System.out.println("-- Regenerating Register Number --");
            }
        }

        return registerNumber;
    }
}
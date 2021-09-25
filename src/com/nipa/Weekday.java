package com.nipa;

public class Weekday extends Student{
    private String freeDay;

    public void addDetails(String nameOfTheStudent, String addressOfTheStudent, char genderOfTheStudent, int birthYearOfTheStudent, String specializationOfTheStudent, String freeDay){
        super.addDetails(nameOfTheStudent, addressOfTheStudent, genderOfTheStudent, birthYearOfTheStudent, specializationOfTheStudent);
        this.freeDay = freeDay;
    }

    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("Student Free Day " + freeDay);
    }
}

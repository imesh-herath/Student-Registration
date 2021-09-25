package com.nipa;

public class Weekend extends Student {
    private String jobTitle;

    public void addDetails(String nameOfTheStudent, String addressOfTheStudent, char genderOfTheStudent, int birthYearOfTheStudent, String specializationOfTheStudent, String jobTitle){
        super.addDetails(nameOfTheStudent, addressOfTheStudent, genderOfTheStudent, birthYearOfTheStudent, specializationOfTheStudent);
        this.jobTitle = jobTitle;
    }

    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("Student Job Title " + jobTitle);
    }
}

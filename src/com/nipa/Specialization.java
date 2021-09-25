package com.nipa;

import java.util.HashMap;

public class Specialization {

    private HashMap<String, Double> specializations = new HashMap<>();

    public void addSpecialization(String specialization, Double GPA) {
        specializations.put(specialization, GPA);
    }
}

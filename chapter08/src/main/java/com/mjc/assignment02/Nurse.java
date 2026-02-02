package com.mjc.assignment02;

import java.util.ArrayList;
import java.util.List;

public class Nurse {

    private String name;
    private List<AnimalPatient> patients = new ArrayList<>();

    public Nurse(String name) {
        this.name = name;
    }

    public void admit(AnimalPatient patient) {
        patients.add(patient);
        System.out.println(
                patient.getAnimal().getName() + " 입원 완료"
        );
    }

    public void giveDailyMedicine() {
        for (int t = 1; t <= 3; t++) {
            for (AnimalPatient p : patients) {
                p.giveMedicine(t);
            }
        }
    }

    public void endDay() {
        for (AnimalPatient p : patients) {
            p.resetDay();
        }
        System.out.println("하루 종료");
    }
}

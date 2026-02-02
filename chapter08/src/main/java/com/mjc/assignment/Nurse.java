package com.mjc.assignment;

import java.util.ArrayList;
import java.util.List;

public class Nurse {
    private String name;
    private List<AnimalPatient> patients = new ArrayList<>();

    public Nurse(String name) {
        this.name = name;
    }

    // 환자 입원
    public void admit(AnimalPatient patient) {
        patients.add(patient);
        System.out.println(patient.getName() + " 입원 처리 완료");
    }

    // 하루 약 3번 지급
    public void giveDailyMedicine() {
        for (int time = 1; time <= 3; time++) {
            for (AnimalPatient p : patients) {
                p.giveMedicine(time);
            }
        }
    }

    // 하루 종료 처리
    public void endDay() {
        for (AnimalPatient p : patients) {
            p.resetDay();
        }
        System.out.println("하루 종료, 면회 기록 초기화");
    }
}


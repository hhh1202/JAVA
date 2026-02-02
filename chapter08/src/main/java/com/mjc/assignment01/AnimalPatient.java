package com.mjc.assignment01;

import java.time.LocalDate;

public class AnimalPatient {
    private AnimalType type;
    private String name;
    private int id;

    private String ownerName;
    private String doctorName;

    private LocalDate admissionDate;
    private LocalDate dischargeDate;

    private boolean visitedToday;

    public AnimalPatient(
        AnimalType type,
        String name,
        int id,
        String ownerName,
        String docotorName,
        LocalDate admissionDate
    ) {
        this.type = type;
        this.name = name;
        this.id = id;
        this.ownerName = ownerName;
        this.doctorName = docotorName;
        this.admissionDate = admissionDate;
        this.visitedToday = false;
    }

    // 퇴원 처리
    public void discharge(LocalDate date) {
        this.dischargeDate = date;
    }

    // 약 먹이기
    public void giveMedicine(int time) {
        System.out.println(
                time + "회차 약 지급 → " + name + " (ID: " + id + ")"
        );
    }

    // 면회
    public void visit(String visitorName, int hour) {
        if (!visitorName.equals(ownerName)) {
            System.out.println("주인만 면회 가능합니다.");
            return;
        }

        if (hour < 15 || hour > 20) {
            System.out.println("면회 시간은 15시~20시입니다.");
            return;
        }

        if (visitedToday) {
            System.out.println("오늘은 이미 면회했습니다.");
            return;
        }

        visitedToday = true;
        System.out.println(name + " 면회 완료");
    }

    // 하루 초기화 (다음 날)
    public void resetDay() {
        visitedToday = false;
    }

    // getter (필요 최소만)
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

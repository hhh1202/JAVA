package com.mjc.assignment02;

public abstract class Care {

    protected boolean visitedToday = false;

    public abstract void giveMedicine(Animal animal, int time);

    public void visit(
            Animal animal,
            HospitalRecord record,
            String visitor,
            int hour
    ) {
        if (!visitor.equals(record.getOwnerName())) {
            System.out.println("주인만 면회 가능합니다.");
            return;
        }

        if (hour < 15 || hour > 20) {
            System.out.println("면회 시간은 15~20시입니다.");
            return;
        }

        if (visitedToday) {
            System.out.println("오늘은 이미 면회했습니다.");
            return;
        }

        visitedToday = true;
        System.out.println(animal.getName() + " 면회 완료");
    }

    public void resetDay() {
        visitedToday = false;
    }
}

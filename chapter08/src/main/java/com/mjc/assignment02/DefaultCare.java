package com.mjc.assignment02;

public class DefaultCare extends Care {

    @Override
    public void giveMedicine(Animal animal, int time) {
        System.out.println(
                time + "회차 약 지급 → "
                        + animal.getName()
                        + " (" + animal.getType() + ", ID: " + animal.getId() + ")"
        );
    }
}

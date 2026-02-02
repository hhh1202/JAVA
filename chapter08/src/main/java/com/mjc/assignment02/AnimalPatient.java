package com.mjc.assignment02;

public class AnimalPatient {

    private Animal animal;
    private HospitalRecord record;
    private Care care;

    public AnimalPatient(
            Animal animal,
            HospitalRecord record
    ) {
        this.animal = animal;
        this.record = record;
        this.care = new DefaultCare();
    }

    public void giveMedicine(int time) {
        care.giveMedicine(animal, time);
    }

    public void visit(String visitor, int hour) {
        care.visit(animal, record, visitor, hour);
    }

    public void resetDay() {
        care.resetDay();
    }

    public Animal getAnimal() {
        return animal;
    }
}


package com.mjc.assignment;

import com.mjc0129.A;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Nurse nurse = new Nurse("김나현");

        AnimalPatient cat = new AnimalPatient(
                AnimalType.CAT,
                "냐옹이",
                101,
                "냐옹이주인",
                "냐옹이의사",
                LocalDate.now()
        );

        nurse.admit(cat);
        nurse.giveDailyMedicine();

        cat.visit("냐옹이주인", 16);
        cat.visit("냐옹이주인", 17);
        nurse.endDay();

        cat.visit("냐옹이주인", 18);
    }
}

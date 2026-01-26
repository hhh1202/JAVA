package com.mjc0115;

public class Car7 {
    int speed;

    void run(){
        System.out.println(speed + "오르 달립니다.");
    }

    static void simulate() {
        Car7 myCar7 = new Car7();
        myCar7.speed = 200;
        myCar7.run();
    }

    public static void main(String[] args) {
        simulate();

        Car7 myCar7 = new Car7();
        myCar7.speed = 60;
        myCar7.run();
    }
}

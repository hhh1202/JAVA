package com.mjc.chapter07;

public class SportsCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;
    }
//    @Override 이거는 오버라이딩 불가
//    public void stop() {
//        System.out.println("STOP!!!!!");
//        speed = 0;
//    }
}

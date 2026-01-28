package com.mjc.chapter07;

public class Car {
    public int speed;
    public void speedUp() {
        speed += 1;
    }
    public final void stop() {
        System.out.println("STOP!!!!");
        speed = 0;
    }
}

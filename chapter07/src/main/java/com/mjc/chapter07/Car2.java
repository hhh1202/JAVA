package com.mjc.chapter07;

public class Car2 {
    public Tire tire;

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public void run(){
        tire.roll();
    }
}

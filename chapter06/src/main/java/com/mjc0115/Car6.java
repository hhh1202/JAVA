package com.mjc0115;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Car6 {
    String model;
    int speed;

    Car6(String model){
        this.model = model;
    }

    void seSpeed(int speed){
        this.speed = speed;
    }

    void run(){
        this.setSpeed(100);
        System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
    }
}

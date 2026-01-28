package com.mjc.chapter07;

public class Phone2 {
    public String model;
    public String color;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Phone2() {
        System.out.println("Phone2() 생성자 실행");
    }
}

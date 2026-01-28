package com.mjc.chapter07;

public class Phone2_2 {
    public String model;
    public String color;

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Phone2_2(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Phone2_2(String model, String color) 생성자 실행");
    }
}

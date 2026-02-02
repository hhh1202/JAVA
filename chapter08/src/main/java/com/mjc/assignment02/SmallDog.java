package com.mjc.assignment02;

public class SmallDog extends Animal {
    public SmallDog(String name, int id) {
        super(name, id);
    }

    @Override
    public String getType() {
        return "소형견";
    }
}


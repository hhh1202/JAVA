package com.mjc.assignment02;

public class Parrot extends Animal {
    public Parrot(String name, int id) {
        super(name, id);
    }

    @Override
    public String getType() {
        return "앵무새";
    }
}


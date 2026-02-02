package com.mjc.assignment02;

public class Rabbit extends Animal {
    public Rabbit(String name, int id) {
        super(name, id);
    }

    @Override
    public String getType() {
        return "토끼";
    }
}

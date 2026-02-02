package com.mjc.assignment02;

public class Cat extends Animal {
    public Cat(String name, int id) {
        super(name, id);
    }

    @Override
    public String getType() {
        return "고양이";
    }
}


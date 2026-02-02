package com.mjc.assignment02;

public class LargeDog extends Animal {
    public LargeDog(String name, int id) {
        super(name, id);
    }

    @Override
    public String getType() {
        return "대형견";
    }
}


package com.mjc.assignment02;

public abstract class Animal {
    protected String name;
    protected int id;

    public Animal(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // 동물 종류 반환 (강제)
    public abstract String getType();
}

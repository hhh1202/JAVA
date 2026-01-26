package com.mjc0115;

public class Singleton {
    private static Singleton singleton = new Singleton();
    Singleton() {

    }
    public static Singleton getInstance(){
        return singleton;
    }
}

package com.mjc.chapter07_2;

public class Swam extends Animal{
    @Override
    public Object eat(Animal obj) {
        System.out.println("Swam은 Animal을 먹지 못합니다.");
        return null;
    }

    @Override
    public void breathe(){
        System.out.println("Swam은 흙을 먹고 숨을 쉽니다.");
    }
}

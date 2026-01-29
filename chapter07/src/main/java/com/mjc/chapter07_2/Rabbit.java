package com.mjc.chapter07_2;

public class Rabbit extends Animal{
    @Override
    public Object eat(Animal obj) {
        if(obj instanceof Swam) {
            System.out.printf("Rabbit이 %s을 먹습니다.", obj);
            return obj;
        }else {
            return String.format("Rabbit는 %s을 먹을 수 없습니다.", obj);
        }
    }

    @Override
    public void breathe(){
        System.out.println("Rabbit은 빠르게 숨을 쉽니다.");
    }
}

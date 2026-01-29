package com.mjc.chapter07_2;

public class Tiger extends Animal{
    @Override
    public Object eat(Animal obj){
        if(obj instanceof Rabbit || obj instanceof Fox){
            System.out.printf("Tiger가 %s를 잡아먹습니다.", obj);
            return obj;
        } else {
            return String.format("Tiger는 %s을 먹지 않습니다.", obj);
        }
    }

    @Override
    public void breathe() {
        System.out.println("Tiger는 강하게 숨을 쉽니다.");
    }
}

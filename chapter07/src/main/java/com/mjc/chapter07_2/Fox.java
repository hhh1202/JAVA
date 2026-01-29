package com.mjc.chapter07_2;

public class Fox extends Animal{
    @Override
    public Object eat(Animal obj){
        if(obj instanceof Rabbit || obj instanceof Swam){
            System.out.printf("Fox가 %s를 먹습니다.", obj);
            return obj;
        }else {
            return String.format("Fox는 %s을 먹을 수 없습니다.", obj);
        }
    }

    @Override
    public void breathe() {
        System.out.println("Fox는 조용히 숨을 쉽니다.");
    }
}

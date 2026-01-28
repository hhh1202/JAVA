package com.mjc.chapter07;

public class SmartPhone2_2 extends Phone2_2 {
    public SmartPhone2_2(String model, String color) {
        super(model, color); // 부모 클래스 필드 호출
        System.out.println("SmartPhone2_2(String model, String color) 생성자 실행됨");
    }
}

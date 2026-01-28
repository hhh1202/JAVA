package com.mjc.chapter07;

public class SmartPhone3 extends Phone3 {
    SmartPhone3(String owner){
        super(owner);
    }

    void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }
}

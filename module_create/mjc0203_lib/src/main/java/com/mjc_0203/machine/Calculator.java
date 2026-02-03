package com.mjc_0203.machine;

public class Calculator {
    public long add(int ... items){
        long result = 0L;
        for(int i=0; i<items.length; i++){
            result += items[i];
        }
//        for(int i=0; i<items.length; i++){
//            result += i;
//        }
        return result;
    }
}

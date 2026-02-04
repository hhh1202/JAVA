package com.mjc_0204;

public class Calculator {
    public long add(int ... arrs){
        long result = 0L;
        for( int a : arrs ){
            result += a;
        }
        return result;
    }

    public double divide(int ... arrs){
        double result = arrs[0];
        for(int i=0; i++<arrs.length;){
            result /= arrs[i];
        }
        return result;
    }
}

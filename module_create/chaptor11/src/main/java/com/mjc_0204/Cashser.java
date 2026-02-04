package com.mjc_0204;

public class Cashser {
    public void calculMoney(int ... arrs){
        Calculator cal = new Calculator();
        double res = cal.divide(arrs);
        System.out.println(res);
    }
}

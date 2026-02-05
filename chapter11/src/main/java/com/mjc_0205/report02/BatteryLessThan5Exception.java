package com.mjc_0205.report02;

public class BatteryLessThan5Exception extends Exception {
    public BatteryLessThan5Exception() {
        System.out.println("배터리가 5% 미만입니다.");
    }

}

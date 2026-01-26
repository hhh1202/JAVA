package com.mjc0115;

public class Printer {
// 객체용 메소드 오버로딩
//    void println(int value) {
//        System.out.println("int value = " + value);
//        return;
//    }
//    void println(boolean value) {
//        System.out.println("boolean value = " + value);
//        return;
//    }
//    void println(double value) {
//        System.out.println("double value = " + value);
//        return;
//    }
//    void println(String value) {
//        System.out.println("String value = " + value);
//        return;
//    }
    // 객체 없이 사용
    static int println(int value){
        System.out.println("int value = " + value);
        return value;
    }
    static boolean println(boolean value){
        System.out.println("boolean value = " + value);
        return value;
    }
    static double println(double value){
        System.out.println("int value = " + value);
        return value;
    }
    static String println(String value){
        System.out.println("int value = " + value);
        return value;
    }


}

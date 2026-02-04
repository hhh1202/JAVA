package com.mjc_0204;


public class Main {
    public static void printLength(String data) {
        int result = data.length();
        System.out.println("문자 수 : " + result);
    }

    public static void printLength2(String data) {
        try {
            int result = data.length();
            System.out.println("문자 수 : " + result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            //System..out.pritnln(e.toString);
            //e.printStackTrace();
        } finally {
            System.out.println("마무리 실행\n");
        }
    }

    public void method1() {
        try {
            method2();
        } catch (ClassNotFoundException e) {
            System.out.println("예외 처리: " + e.getMessage());
        }
    }

    public void method2() throws  ClassNotFoundException {
        Class.forName("java.lang.String2");
    }

    public static void main(String[] args) {
//        Cashser cashser = new Cashser();
//        cashser.calculMoney(20, 30, 30, 40);

        System.out.println("==========11-2 예외 처리 코드===========");
//        System.out.println("[프로그램 시작]\n");
//        printLength("ThisIsJava");
//        printLength(null);
//        System.out.println("[프로그램 종료]");

//        System.out.println("[프로그램 시작]\n");
//        printLength2("ThisIsJava");
//        printLength2(null);
//        System.out.println("[프로그램 종료]");
        System.out.println();

//        try{
//            Class.forName("java.lang.String");
//            System.out.println("java.lang.String 클래스가 존재합니다.");
//        }catch (ClassNotFoundException e){
//            e.printStackTrace();
//        }
//        System.out.println();
//
//        try{
//            Class.forName("java.lang.String2");
//            System.out.println("java.lang.String2 클래스가 존재합니다.");
//        } catch (ClassNotFoundException e){
//            e.printStackTrace();
//        }
//        System.out.println();

        System.out.println("=========11-3 예외 종류에 따른 처리============");
//        String[] array = {"100", "1oo"};
//
//        for (int i = 0; i < array.length; i++) {
//            try {
//                int value = Integer.parseInt(array[i]);
//                System.out.println("array[" + i + "]: " + value);
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
//            } catch (NumberFormatException e) {
//                System.out.println("숫자로 변환할 수 없음: " + e.getMessage());
//            }
//        }

//        String[] array2 = {"100", "1oo"};
//
//        for (int i = 0; i <= array2.length; i++) {
//            try {
//                int value2 = Integer.parseInt(array2[i]);
//                System.out.println("array[" + i + "]: " + value2);
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
//            } catch (Exception e){
//                System.out.println("실행에 문제가 있습니다.");
//            }
//        }

//        String[] array3 = {"100", "1oo", null, "200"};
//
//        for(int i=0; i<=array3.length; i++){
//            try{
//                int value3 = Integer.parseInt((array3[i]));
//                System.out.println("array[" + i + "]: " + value3);
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
//            } catch (NullPointerException | NumberFormatException e) {
//                System.out.println("데이터에 문제가 있음: " + e.getMessage());
//            }
//        }
//        System.out.println();

        System.out.println("============11-4 리소스 자동 닫기============");
//        try(MyResource res = new MyResource("A")){
//            String data = res.read1();
//            int value4 = Integer.parseInt((data));
//        } catch (Exception e){
//            System.out.println("예외 처리: " + e.getMessage());
//        }
//        System.out.println();
//
//        try (MyResource res = new MyResource("A")){
//            String data = res.read2();
//            int value = Integer.parseInt(data);
//        } catch (Exception e){
//            System.out.println("예외 처리: " + e.getMessage());
//        }
//        System.out.println();
//
//        MyResource res1 = new MyResource("A");
//        MyResource res2 = new MyResource("B");
//        try (res1; res2) {
//            String data1 = res1.read1();
//            String data2 = res2.read2();
//        } catch (Exception e) {
//            System.out.println("예외 처리: " + e.getMessage());
//        }
//        System.out.println();

        System.out.println("===========11-5 예외 떠넘기기===========");
        try {
            findClass();
        }catch (ClassNotFoundException e){
            System.out.println("예외 처리: " + e.toString());
        }
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}

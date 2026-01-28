package com.mjc.chapter07;

public class Main {
    public static void main(String[] args){
        System.out.println("===========7장 Phone/SmartPhone.java 클래스 상속===========");
        SmartPhone myPhone = new SmartPhone("갤럭시", "화이트");

        myPhone.setModel("갤럭시");
        myPhone.setColor("화이트");
        System.out.println("getModel 모델명 : " + myPhone.getModel());
        System.out.println("getModel 색상 : " + myPhone.getColor());
        System.out.println("getModel Wifi 상태 : " + myPhone.isWifi());
        System.out.println();

        System.out.println("모델 : " + myPhone.model);
        System.out.println("색상 : " + myPhone.color);
        System.out.println("와이파이 상태 : " + myPhone.wifi);
        System.out.println();

        myPhone.bell();
        myPhone.sendVoice("여볼래용");
        myPhone.receiveVoie("여볼래용 누구시봉");
        myPhone.sendVoice("여볼래요옹");
        myPhone.hangUp();
        System.out.println();

        myPhone.setWifi(true);
        myPhone.internet();
        System.out.println();

        System.out.println("===========7장 Phone2/SmartPhone2.java 부모 생성자 호출===========");
        SmartPhone2 myPhone2 = new SmartPhone2("갤럭시", "화이트");
        myPhone2.setModel("갤럭시");
        myPhone2.setColor("화이트");
        System.out.println("setModel 모델 : " + myPhone2.getModel());
        System.out.println("setColor 색상 : " + myPhone2.getColor());
        System.out.println();

        System.out.println("모델 : " + myPhone2.model);
        System.out.println("색상 : " + myPhone2.color);
        System.out.println();

        SmartPhone2_2 myPhone2_2 = new SmartPhone2_2("갤럭시", "화이트");
        myPhone2_2.setModel("갤럭시");
        myPhone2_2.setColor("화이트");
        System.out.println("setModel 모델 : " + myPhone2_2.getModel());
        System.out.println("setColor 색상 : " + myPhone2_2.getColor());
        System.out.println();

        System.out.println("모델 : " + myPhone2_2.model);
        System.out.println("색상 : " + myPhone2_2.color);
        System.out.println();

        System.out.println("=======7장 Coalculator/Computer.java 메소드 재정의===========");
        int r= 10;

        Calculator calculator = new Calculator();
        System.out.println("원 면적 : " + calculator.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원 면적 : " + computer.areaCircle(r));
        System.out.println();

        System.out.println("=======Airplane/SupersonicAirplane.java 부모 메소드 호출=========");
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
        System.out.println();

        System.out.println("===========Parent/Child.java 자동타입변환================");
        Child child = new Child();
        Parent parent =new Parent();

        parent.method1();
        parent.method2();

    }
}
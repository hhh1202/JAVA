package com.mjc0115;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Chapter06 C06 = new Chapter06();

        Car myCar = new Car(); // Car 객체 생성
        System.out.println("===========Car.java 필드 사용============ ");
        System.out.println("제작회사: " + myCar.company);
        System.out.println("모델명: " + myCar.model);
        System.out.println("색깔: " + myCar.color);
        System.out.println("최고속도: " + myCar.maxSpeed);
        System.out.println("현재속도: " + myCar.speed);

        myCar.speed = 60; // 객체의 필드값 변경
        System.out.println("현재속도: " + myCar.speed);
        System.out.println();

        System.out.println("============Car2.java 생성자 선언===============");
        Car2 myCar2 = new Car2("BMW","흰색", 400);
        System.out.println();

        System.out.println("===============Korean.java 필드 초기화===============");
        Korean k1 = new Korean("한환희", "021202-1234567");
        System.out.println("k1.nation : " + k1.nation);
        System.out.println("k1.name : " + k1.name);
        System.out.println("k1.ssn : " + k1.ssn);
        System.out.println();

        Korean k1_2 = new Korean("김효린", "060912-1234567");
        System.out.println("k2.nation : " + k1_2.nation);
        System.out.println("k2.name : " + k1_2.name);
        System.out.println("k2.ssn : " + k1_2.ssn);
        System.out.println();

        System.out.println("===============Car3.java 생성자 오버로딩================");
        Car3 myCar3_1 = new Car3();
        System.out.println("car3_1.company : " + myCar3_1.company);
        System.out.println();
        Car3 myCar3_2 = new Car3("자가용");
        System.out.println("car3_2.company : " + myCar3_2.company);
        System.out.println("car3_2.model : " + myCar3_2.model);
        System.out.println();
        Car3 myCar3_3 = new Car3("자가용", "검은색");
        System.out.println("car3_3.company : " + myCar3_3.company);
        System.out.println("car3_3.model : " + myCar3_3.model);
        System.out.println("car3_3.color : " + myCar3_3.color);
        System.out.println();
        Car3 myCar3_4 = new Car3("택시", "흰색", 250);
        System.out.println("car3_4.company : " + myCar3_4.company);
        System.out.println("car3_4.model : " + myCar3_4.model);
        System.out.println("car3_4.color : " + myCar3_4.color);
        System.out.println("car3_4.maxSpeed : " + myCar3_4.maxSpeed);
        System.out.println();

        System.out.println("==============Car4.java 다른 생성자 호출================");
        Car4 myCar4_1 = new Car4("자가용");
        System.out.println("car4_1.company : " + myCar4_1.company);
        System.out.println("car4_1.model : " + myCar4_1.model);
        System.out.println();

        Car4 myCar4_2 = new Car4("자가용", "보라");
        System.out.println("car4_2.company : " + myCar4_2.company);
        System.out.println("car4_2.model : " + myCar4_2.model);
        System.out.println("car4_2.color : " + myCar4_2.color);
        System.out.println();

        Car4 myCar4_3 = new Car4("택시", "노랑", 300);
        System.out.println("car4_3.company : " + myCar4_3.company);
        System.out.println("car4_3.model : " + myCar4_3.model);
        System.out.println("car4_3.color : " + myCar4_3.color);
        System.out.println("car4_3.color : " + myCar4_3.maxSpeed);
        System.out.println();

        System.out.println("================Calculator.java 메소드 선언 및 호출=================");
        Calculator myCalc = new Calculator();
        myCalc.powerOn();
        int result1 = myCalc.plus(5,6);
        System.out.println("result1 : " + result1);

        int x = 10;
        int y = 4;
        double result2 = myCalc.divide(x, y);
        System.out.println("result2 : " + result2);

        myCalc.powerOff();
        System.out.println();

        System.out.println("================Computer.java 가변길이 매개변수===============");
        Computer myCom = new Computer();
        int result3 = myCom.sum(1,2,3);
        System.out.println("result3 : " + result3);
        int result4 = myCom.sum(1,2,3,4,5);
        System.out.println("resutl4 : " + result4);
        int[] values = {1,2,3,4,5};
        int result5 = myCom.sum(values);
        System.out.println("result5 : " + result5);
        int result6 = myCom.sum(new int[] {1,2,3,4,5});
        System.out.println("result6 : " + result6);
        System.out.println();

        System.out.println("================Car5.java return문====================");
        Car5 myCar5 = new Car5();
        myCar5.setGas(5);
        if(myCar5.isLeftGas()){
            System.out.println("출발합니다.");
            myCar5.run();
        }
        System.out.println("gas를 주입하세요.");
        System.out.println();

        System.out.println("================Calculator2.java 메소드 오버로딩=================");
        Calculator2 myCalc2 = new Calculator2();
        double result7 = myCalc2.areaRectangle(10);
        double result8 = myCalc2.areaRectangle(10,20);

        System.out.println("정사각형 넓이 : " + result7);
        System.out.println("직사각형 넓이 : " + result8);
        System.out.println();

        System.out.println("================객체 과제 문제 풀이===================");
        System.out.println("=======================과제1=======================");
        Myphone p = new Myphone();
        System.out.println("폰 이름 : " + p.name);
        System.out.println("폰 기종 : " + p.model);
        System.out.println();

        System.out.println("================Car6.java 인스턴스 멤버===============");
        Car6 myCar6 = new Car6("Porsche");
        Car6 yourCar6 = new Car6("BMW");
        myCar6.run();
        yourCar6.run();
        System.out.println();

        System.out.println("======================Calculator3.java 정적 멤버======================");
        double result9 = 10 * 10 * Calculator3.pi;
        int result10 = Calculator3.plus(10, 5 );
        int result11 = Calculator3.minus(10, 5 );
        System.out.println("result9 : " + result9);
        System.out.println("result10 : " + result10);
        System.out.println("result11 : " + result11);
        System.out.println();

        System.out.println("====================Television.java 정적 블록=====================");
        System.out.println(Television.info);
        System.out.println();

        System.out.println("====================인스턴스 맴버 사용 불가================");
        System.out.println();

        System.out.println("=================Korean.java final 필드와 상수==================");
        Korean2 k2 = new Korean2("123456-1234567", "한자바");

        System.out.println(k2.nation);
        System.out.println(k2.ssn);
        System.out.println(k2.name);
        k1.name = "김자바";
        System.out.println();

        System.out.println("==================Earth.java 상수 선언===================");
        System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS + "km");
        System.out.println("지구의 표면적 : " + Earth.EARTH_SURFACE_AREA + "km^2");
        System.out.println();

        System.out.println("========================Car8.java Getter, Setter=======================");
        Car8 myCar8 = new Car8();
        myCar8.setSpeed(-50);
        System.out.println("현재 속도 : " + myCar8.getSpeed());
        myCar8.setSpeed(60);
        System.out.println("현재 속도 : " + myCar8.getSpeed());
        if(!myCar8.isStop()) {
            myCar8.setStop(true);
        }
        System.out.println("현재 속도 : " + myCar8.getSpeed());
        System.out.println();

        System.out.println("=================Singleton.java 싱글톤 패턴======================");
//        Singleton obj1 = new Singleton();
//        Singleton obj1 = new Singleton();
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2) {
            System.out.println("같은 Singleton 객체입니다.");
        }else {
            System.out.println("다른 Singleton 객체입니다.");
        }
    }
}
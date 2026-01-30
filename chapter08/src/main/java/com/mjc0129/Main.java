package com.mjc0129;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=======8장 RemoteControl/Television/Audio.java 인터페이스 구현 클래스======");
        RemoteControl rc = new Television();
        rc.turnOn();

        rc = new Audio();
        rc.turnOn();
        System.out.println();

        System.out.println("=========8장 RemoteControl2.java 인터페이스 상수 필드==========");
        System.out.println("리모콘 최대 볼륨 : " + RemoteControl2.MAX_VOLUME);
        System.out.println("리모콘 최저 볼륨 : " + RemoteControl2.MIN_VOLUME);
        System.out.println();

        System.out.println("======8장 RemoteControl3/Television2.java 추상 메소드=========");
        RemoteControl3 rc3;

        rc3 = new Television2();
        rc3.turnOn();
        rc3.setVolume(5);
        rc3.turnOff();

        rc3 = new Audio2();
        rc3.turnOn();
        rc3.setVolume(10);
        rc3.turnOff();
        System.out.println();

        System.out.println("=============8장 RemoteControl4.java 디폴트 메소드=================");
        RemoteControl4 rc4;
        rc4 = new Television();
        rc4.turnOn();
        rc4.setVolume(5);
        rc4.setMute(true);
        rc4.setMute(false);
        System.out.println();

        rc4 = new Audio3();
        rc4.turnOn();
        rc4.setVolume(5);
        rc4.setMute(true);
        rc4.setMute(false);
        System.out.println();

        System.out.println("=======8장 RemoteControl5.java 정적메소드===========");
        RemoteControl5 rc5;
        rc5 = new Television();
        rc5.turnOn();
        rc5.setVolume(5);
        rc5.setMute(true);
        rc5.setMute(false);
        System.out.println();

        rc5 = new Audio();
        rc5.turnOn();
        rc5.setVolume(5);
        rc5.setMute(true);
        rc5.setMute(false);
        System.out.println();

        RemoteControl5.changeBattery();
        System.out.println();

        System.out.println("=========Service/ServiceImpl.java 8장 private메소드=========");
        Service service = new ServiceImpl();

        service.defaultMethod1();
        System.out.println();
        service.defaultMethod2();
        System.out.println();

        Service.staticMethod1();
        System.out.println();
        Service.staticMethod2();
        System.out.println();

        System.out.println("====RemoteControl6/Searchable/SmartTelevision.java 8장 다중 인터페이스 구현====");
        RemoteControl6 rc6 = new SmartTelevision();
        rc6.turnOn();
        rc6.turnOff();
        Searchable searchable = new SmartTelevision();
        searchable.search("https:/www.youtube.com");
        System.out.println();

        System.out.println("========InterfaceA,B,C/InterfaceCImpl.java 8장 인터페이스 상속========");
        InterfaceCImpl impl = new InterfaceCImpl();

        InterfaceA ia = impl;
        ia.methodA();
        System.out.println();

        InterfaceB ib = impl;
        ib.methodB();
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
        System.out.println();

        System.out.println("============A,B,C,D,E.java 8장 타입변환=============");
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a;

        a = b;
        a = c;
        a = d;
        a = e;

        System.out.println("강제 타입변환");
        Vehicle vehicle = new Bus();
        vehicle.run();

        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
        System.out.println();

        System.out.println("=======Tire/HankookTire/KumhoTire/Car.java 8장 다형성=======");
        Car myCar = new Car();
        myCar.run();

        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new KumhoTire();

        myCar.run();
        System.out.println();

        System.out.println("-매개변수의 다형성-");
        Driver driver = new Driver();
        Bus2 bus2 = new Bus2();
        Taxi taxi = new Taxi();

        driver.drive(bus2);
        driver.drive(taxi);
        System.out.println();

        System.out.println("============Bus3/Taxi2.java 8장 객체 타입 확인============");
        Taxi2 taxi2 = new Taxi2();
        Bus3 bus3 = new Bus3();
        ride(taxi2);
        System.out.println();
        ride(bus3);
        System.out.println();

        System.out.println("====InterfaceA_a/InterfaceB_b/InterfaceC_c/ImplClass.java8장 봉인된 인터페이스====");
        ImplClass impl2 = new ImplClass();

        InterfaceA_a ia_a = impl2;
        ia_a.methodA_a();
        System.out.println();

        InterfaceB_b ib_b = impl2;
        ib_b.methodA_a();
        ib_b.methodB_b();
        System.out.println();

        InterfaceC_c ic_c = impl2;
        ic_c.methodA_a();
        ic_c.methodB_b();
        ic_c.methodC_c();
        System.out.println();

        System.out.println("======Remocon/TV.java 8장 확인문제 5번=======");
        Remocon r = new TV();
        r.powerOn();
        System.out.println();

        System.out.println("=======Soundable/Cat/Dog.java 8장 확인문제 6번=======");
        printSound(new Cat());
        printSound(new Dog());
        System.out.println();

        System.out.println("=====DataAccessObject/OracleDao/MySqlDao.java 8장 확인문제 7번=====");
        dbWork(new OracleDao());
        dbWork(new MySqlDao());
        System.out.println();

        System.out.println("========AA/BB/CC.java 8장 확인문제 8번=========");
        action(new BB());
        action(new CC());

    }

    public static void printSound(Soundable soundable){
        System.out.println(soundable.sound());
    }

    public static void dbWork(DataAccessObject dao){
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void action(AA aa){
        aa.method1();
        if(aa instanceof CC c){
            c.method2();
        }
    }

    public static void ride(Vehicle vehicle) {
        if(vehicle instanceof Bus3 bus3){
            bus3.checkFare();
        }
        vehicle.run();
    }
}
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
        System.out.println();

        System.out.println("======Tire/HankookTire/KumhoTire/Car2.java 필드다형성==========");
        Car2 myCar2 = new Car2();

        myCar2.tire = new Tire();
        myCar2.run();

        myCar2.tire = new HankookTire();
        myCar2.run();

        myCar2.tire = new KumhoTire();
        myCar2.run();
        System.out.println();

        System.out.println("=========Vehicle/Bus/Taxi/Driver.java 매개변수 다형성===============");
        Driver driver = new Driver();
        Bus bus = new Bus();
        driver.drive(bus);

        Taxi taxi = new Taxi();
        driver.drive(taxi);
        System.out.println();

        System.out.println("===============Person.java 객체 타입 확인==================");
        Person p1 = new Person("한환희");
        personInfo(p1);

        System.out.println();

        Person p2 = new Student("정태환", 10);
        personInfo(p2);
        System.out.println();

        System.out.println("============Phone3/SmartPhone3.java 추상 클래스=================");
        SmartPhone3 smartPhone3 = new SmartPhone3("홍길동");
        smartPhone3.turnOn();;
        smartPhone3.internetSearch();
        smartPhone3.turnOff();
        System.out.println();

        System.out.println("=========Animal/Dog/Cat.java 추상메소드 재정의=============");
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        animalSound(new Dog());
        animalSound(new Dog());
        System.out.println();

        System.out.println("======Person2/Employee/Manager/Director.java 봉인된 클래스========");
        Person2 p = new Person2();
        Employee e = new Employee();
        Manager m = new Manager();
        Director d = new Director();

        p.work();
        e.work();
        m.work();
        d.work();

    }
    public static void animalSound(Animal animal){
        animal.sound();
    }

    public static void personInfo(Person person){
        System.out.println("name : " + person.name);
        person.walk();

        if(person instanceof Student student) {
            System.out.println("StudentNo : " + student.studentNo);
            student.study();
        }
    }

}
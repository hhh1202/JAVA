package com.mjc_0224;

public class GenericExample {

    public static <T extends Number> boolean compare(T t1, T t2){
        System.out.println("compare(" + t1.getClass().getSimpleName() + ", " + t2.getClass().getSimpleName() + ")");
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        return (v1 == v2);
    }

    public static <T> Box2<T> boxing(T t) {
        Box2<T> box2 = new Box2<T>();
        box2.set(t);
        return box2;
    }

    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<>();

        product1.setKind(new Tv());
        product1.setModel("스마트Tv");

        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        Product<Car, String> product2 = new Product<>();

        product2.setKind(new Car());
        product2.setModel("SUV자동차");

        Car car = product2.getKind();
        String carModel = product1.getModel();

        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();;
        home.turnOnLight();

        CarAgency carAgency = new CarAgency();
        Car car2 = carAgency.rent();
        car2.run();

        Box<String> box1 = new Box<>();
        box1.content = "100";

        Box<String> box2 = new Box<>();
        box2.content = "100";

        boolean result1 = box1.compare(box2);
        System.out.println("result1: " + result1);

        Box2<Integer> box3 = boxing(100);
        int intValue = box3.get();
        System.out.println(intValue);

        Box2<String> box4 = boxing("홍길동");
        String strValue = box4.get();
        System.out.println(strValue);

        boolean result2 = compare(10, 20);
        System.out.println(result2);
        System.out.println();

        boolean result3 = compare(4.5, 4.5);
        System.out.println(result3);

        System.out.println("자바 확인문제 2번");

    }
}

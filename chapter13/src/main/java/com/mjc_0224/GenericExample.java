package com.mjc_0224;

public class GenericExample {
    public static void main(String[] args) {
//        Product<Tv, String> product1 = new Product<>();
//
//        product1.setKind(new Tv());
//        product1.setModel("스마트Tv");
//
//        Tv tv = product1.getKind();
//        String tvModel = product1.getModel();
//
//        Product<Car, String> product2 = new Product<>();
//
//        product2.setKind(new Car());
//        product2.setModel("SUV자동차");
//
//        Car car = product2.getKind();
//        String carModel = product1.getModel();

        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();;
        home.turnOnLight();

        CarAgency carAgency = new CarAgency();
        Car car2 = carAgency.rent();
        car2.run();
    }
}

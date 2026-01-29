package com.mjc.chapter07_2;

public class Main {
    public static void main(String[] args){
        Animal rabbit = new Rabbit();
        Animal tiger = new Tiger();
        Animal fox = new Fox();
        Animal swam = new Swam();

        tiger.eat(rabbit);
        tiger.eat(fox);
        tiger.eat(swam);
        System.out.println();

        rabbit.eat(tiger);
        rabbit.eat(fox);
        rabbit.eat(swam);
        System.out.println();

        fox.eat(rabbit);
        fox.eat(tiger);
        fox.eat(swam);
        System.out.println();

        swam.eat(rabbit);
        swam.eat(tiger);
        swam.eat(fox);
    }
}

package com.mjc_0304.test16_5;

public class MethodReferenceExample {
    public static void main(String[] args){
        Person person = new Person();

        person.action( Computer :: staticMethod );

        Computer com = new Computer();

        person.action( com :: instanceMethod );

        person.ordering( String :: compareToIgnoreCase );
    }
}

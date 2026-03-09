package com.mjc_0306.test18_10;

import java.io.Serializable;

public class Product implements Serializable{
    public static final long serialVersionUID = -621812868470078544L;
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() { return name + ": " + price;}

}

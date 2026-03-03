package com.mjc_0224;

import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        TreeSet<Fruit> treeSet1 = new TreeSet<Fruit>(new FruitComparator());

        treeSet1.add(new Fruit("포도", 3000));
        treeSet1.add(new Fruit("수박", 10000));
        treeSet1.add(new Fruit("딸기", 6000));

        for(Fruit fruit : treeSet1) {
            System.out.println(fruit.name + ":" + fruit.price);
        }
    }
}

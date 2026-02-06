package com.mjc_0206;

import java.util.HashSet;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Java");
        set.add("Spring");
        System.out.println();

        int size = set.size();
        System.out.println("총 객체 수: " + size);

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("JSP");
            if(element.equals("JSP")) {
                iterator.remove();
            }
        }
        System.out.println();
        set.remove("JDBC");

        for(String element : set) {
            System.out.println(element);
        }
        System.out.println();

        Set<Member> set2 = new HashSet<Member>();
        set2.add(new Member("홍길동", 30));
        set2.add(new Member("홍길동", 30));

        System.out.println("총 객체 수: " + set.size());

    }
}
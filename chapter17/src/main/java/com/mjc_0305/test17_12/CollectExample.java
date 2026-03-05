package com.mjc_0305.test17_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 87));
        totalList.add(new Student("감자바", "남", 95));
        totalList.add(new Student("오해영", "여", 93));

        List<Student> maleList = totalList.stream()
                .filter(s -> s.getSex().equals("남"))
                .toList();

        maleList.stream()
                .forEach(s -> System.out.println(s.getName()));

        System.out.println();

        Map<String, Integer> map = totalList.stream()
                .collect(
                        Collectors.toMap(
                                s -> s.getName(),
                                s -> s.getScore()
                        )
                );

        System.out.println(map);
        System.out.println();

        Map<String, List<Student>> map2 = totalList.stream()
                .collect(
                        Collectors.groupingBy(s -> s.getSex())
                );

        List<Student> maleList2 = map2.get("남");
        maleList2.stream().forEach(s -> System.out.println(s.getName()));
        System.out.println();

        List<Student> femaleList = map2.get("여");
        femaleList.stream().forEach(s -> System.out.println(s.getName()));
        System.out.println();

        Map<String, Double> map3 = totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                s -> s.getSex(),
                                Collectors.averagingDouble(s->s.getScore())
                    )
            );

        System.out.println(map3);
    }



}

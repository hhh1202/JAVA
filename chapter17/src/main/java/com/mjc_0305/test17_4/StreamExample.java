package com.mjc_0305.test17_4;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static int sum;

    public static void main(String[] args) throws Exception{
        List<Product> list = new ArrayList<>();
        for(int i=1; i<=5; i++) {
            Product product = new Product(i, "상품"+i, "멋진 회사 ", (int)(10000*Math.random()));
            list.add(product);
        }

        Stream<Product> stream = list.stream();
        stream.forEach(p -> System.out.println(p));

        String[] strArray = { "홍길동", "신용권", "김미나" };
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(item -> System.out.print(item + ","));
        System.out.println();

        int[] intArray = { 1, 2, 3, 4, 5 };
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(item -> System.out.print(item + ","));
        System.out.println();

        IntStream stream2 = IntStream.rangeClosed(1, 100);
        stream2.forEach(a -> sum += a);
        System.out.println("총합: " + sum);

        Path path = Paths.get(StreamExample.class.getResource("data.txt").toURI());
        Stream<String> stream3 = Files.lines(path, Charset.defaultCharset());
        stream.forEach(line -> System.out.println(line));
        stream.close();
    }
}

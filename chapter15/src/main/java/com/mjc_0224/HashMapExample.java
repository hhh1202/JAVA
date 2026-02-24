package com.mjc_0224;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("정태환", 85);
        map.put("이상익", 90);
        map.put("황규빈", 80);
        map.put("이상익", 95);
        System.out.println("총 Entry 수: " + map.size());
        System.out.println();

        String key = "이상익";
        int value = map.get(key);
        System.out.println(key + ": " + value);
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + " : " + v);
        }
        System.out.println();

        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }
        System.out.println();

        map.remove("이상익");
        System.out.println("총 Entry 수: " + map.size());
        System.out.println();
    }
}

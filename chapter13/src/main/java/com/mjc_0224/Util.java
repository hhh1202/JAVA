package com.mjc_0224;

public class Util {
    public static <K, V> V getValue(Pair<K, V> pair, K key) {
        if(pair == null || key == null) {
            return null;
        }

        if(key.equals(pair.getKey())) {
            return pair.getValue();
        }

        return null;
    }
}

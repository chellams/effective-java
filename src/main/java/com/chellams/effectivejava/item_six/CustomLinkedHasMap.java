package com.chellams.effectivejava.item_six;

import java.util.LinkedHashMap;
import java.util.Map;

public class CustomLinkedHasMap<K,V> extends LinkedHashMap<K,V> {

    private final int maxSize;

    public CustomLinkedHasMap(int maxSize) {
        super();
        this.maxSize = maxSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > maxSize;
    }

    public static void main(String[] args) {
        CustomLinkedHasMap<Integer, String> customMap = new CustomLinkedHasMap<>(3);

        customMap.put(1, "One");
        customMap.put(2, "Two");
        customMap.put(3, "Three");
        customMap.put(4, "Four");

        System.out.println(customMap); // Output will exclude the eldest entry (1, "One")
    }
}

package com.chellams.effectivejava.item_one;

import java.util.HashMap;
import java.util.Map;

public class ReuseObjects {

    private static Map<String, ReuseObjects> instances = new HashMap<>();
    private final String name;

    private ReuseObjects(String name) {
        this.name = name;
    }

    public static ReuseObjects getInstance(String key) {
        if (!instances.containsKey(key)) {
            instances.put(key, new ReuseObjects(key));
        }
        return instances.get(key);
    }

    public String getName() {
        return name;
    }
}

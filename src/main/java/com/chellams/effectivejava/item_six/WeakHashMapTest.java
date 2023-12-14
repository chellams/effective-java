package com.chellams.effectivejava.item_six;

import java.util.WeakHashMap;

public class WeakHashMapTest {
    public static void main(String[] args) {
        WeakHashMap<Key, Value> weakHashMap = new WeakHashMap<>();
        Key key1 = new Key("1");
        Key key2 = new Key("2");

        weakHashMap.put(key1, new Value("value1"));
        weakHashMap.put(key2, new Value("value2"));

        // Output will include all th entries
        weakHashMap.forEach((key, value) -> System.out.println("key " + key.getKeyName() + " value " + value.getValue()));

        key1 = null; // by nulled out the key1, entry will be removed from map.

        // Triggering garbage collection to potentially remove unreferenced keys
        System.gc();

        System.out.println(" after garbage collection =========================================");

        // Output will exclude the nulled out key and associated value
        weakHashMap.forEach((key, value) -> System.out.println("key " + key.getKeyName() + " value " + value.getValue()));
    }

    static class Key {
        private final String keyName;

        public Key(String keyName) {
            this.keyName = keyName;
        }

        public String getKeyName() {
            return keyName;
        }
    }

    static class Value {
        private final String value;

        public Value(String keyName) {
            this.value = keyName;
        }

        public String getValue() {
            return value;
        }
    }
}

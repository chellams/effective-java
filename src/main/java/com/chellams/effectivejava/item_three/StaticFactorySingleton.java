package com.chellams.effectivejava.item_three;

public class StaticFactorySingleton {
    private static StaticFactorySingleton INSTANCE = new StaticFactorySingleton();

    public static StaticFactorySingleton getInstance() {
        return INSTANCE;
    }

    private StaticFactorySingleton() {
    }

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

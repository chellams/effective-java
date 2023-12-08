package com.chellams.effectivejava.item_three;

public class PublicStaticSingleton {
    public static PublicStaticSingleton INSTANCE = new PublicStaticSingleton();

    private PublicStaticSingleton() {
    }

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

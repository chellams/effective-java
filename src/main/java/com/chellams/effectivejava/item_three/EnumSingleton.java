package com.chellams.effectivejava.item_three;

public enum EnumSingleton {
    INSTANCE;

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

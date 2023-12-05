package com.chellams.effectivejava.item_one;

public class ParentObject {
    public String getName() {
        return name;
    }

    protected String name;

    public ParentObject(String name) {
        this.name = name;
    }

    public static ParentObject getSuitableObject(int size) {
        return size > 10 ? new ParentObject("parent") : new ChildObject("child");
    }
}


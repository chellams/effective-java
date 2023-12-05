package com.chellams.effectivejava.item_one;

public class MultipleConstructors {
    private int serialNumer;
    private String name;

    private MultipleConstructors() {

    }

    private MultipleConstructors(String name) {
        this.name = name;
    }

    private MultipleConstructors(int serialNumer, String name) {
        this.serialNumer = serialNumer;
        this.name = name;
    }

    public static MultipleConstructors getInstanceWithName(String name) {
        return new MultipleConstructors(name);
    }

    public static MultipleConstructors getInstanceWithNameAndSerialNumber(int serialNumer, String name) {
        return new MultipleConstructors(serialNumer, name);
    }

    @Override
    public String toString() {
        return "MultipleConstructors{" +
                "serialNumer=" + serialNumer +
                ", name='" + name + '\'' +
                '}';
    }
}

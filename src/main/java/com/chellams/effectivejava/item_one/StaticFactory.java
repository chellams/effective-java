package com.chellams.effectivejava.item_one;

import java.util.Objects;

public class StaticFactory {

    public static void main(String[] args) {
        MultipleConstructors alice = MultipleConstructors.getInstanceWithName("Alice");
        System.out.println(alice);
        MultipleConstructors bob = MultipleConstructors.getInstanceWithNameAndSerialNumber(100, "Bob");
        System.out.println(bob);

        ReuseObjects first = ReuseObjects.getInstance("first");
        System.out.println(first.getName());

        ParentObject parentObject = ParentObject.getSuitableObject(5);
        System.out.println(Objects.equals(parentObject.getName(), "child"));
        parentObject = ParentObject.getSuitableObject(20);
        System.out.println(Objects.equals(parentObject.getName(), "parent"));
    }
}

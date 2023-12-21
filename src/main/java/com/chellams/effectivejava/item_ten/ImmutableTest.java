package com.chellams.effectivejava.item_ten;

public class ImmutableTest {

    public static void main(String[] args) {
        ImmutableComplex immutableComplex = new ImmutableComplex(2.0, 3.0);
        System.out.println(immutableComplex.add(new ImmutableComplex(3.0, 4.0)));
    }
}

package com.chellams.effectivejava.item_eight;

public class ArrayExample {
    public final Data[] PUBLIC_VARIABLE;

    ArrayExample() {
        PUBLIC_VARIABLE = new Data[]{new Data(1), new Data(2), new Data(3)};
    }
}

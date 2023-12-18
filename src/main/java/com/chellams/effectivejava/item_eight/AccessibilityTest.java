package com.chellams.effectivejava.item_eight;

public class AccessibilityTest {
    public static final ArrayExample arrayExample = new ArrayExample();

    public static void main(String[] args) {
        System.out.println(arrayExample.PUBLIC_VARIABLE[0].getNumber());
        arrayExample.PUBLIC_VARIABLE[0] = new Data(1000);
        System.out.println(arrayExample.PUBLIC_VARIABLE[0].getNumber());
    }
}

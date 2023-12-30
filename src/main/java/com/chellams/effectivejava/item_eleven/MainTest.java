package com.chellams.effectivejava.item_eleven;

import java.util.Arrays;
import java.util.HashSet;

public class MainTest {
    public static void main(String[] args) {
        ErrorHashsetImpl<String> errorHashset = new ErrorHashsetImpl<>();
        errorHashset.addAll(Arrays.asList("One", "Two", "Three"));
        System.out.println(errorHashset.getAddedCount()); // We need to get count is 3 as we are adding only three
        // elements. But we will get 6 as the addAll method. Because addAll method in ErrorHashsetImpl and it invokes
        // super.addAll() which is in Hashset. Again addAll() is invoked add method in ErrorHashsetImpl. Each method
        // add count 1. So we get 6. (Till Java 17).

        ProperHashImpl<String> properHash = new ProperHashImpl<>(new HashSet<>(5));
        properHash.addAll(Arrays.asList("One", "Two", "Three"));
        System.out.println(properHash.getAddedCount()); // IN forwarding merhod approach, we can avoid such issues.
    }
}

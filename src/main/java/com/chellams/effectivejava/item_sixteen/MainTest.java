package com.chellams.effectivejava.item_sixteen;

import java.util.Arrays;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(6, 4, 2, 1, 5, 3, 2);
        numbers.sort(new IntComparator());
        System.out.println(numbers);

        List<Integer> anotherNumbers = Arrays.asList(600, 400, 200, 100, 500, 300, 200);
        anotherNumbers.sort(IntComparator.INSTANCE);
        System.out.println(anotherNumbers);

        List<Integer> newNumbers = Arrays.asList(6000, 4000, 2000, 1000, 5000, 3000, 2000);
        newNumbers.sort(PrivateNumberComparator.INSTANCE);
        System.out.println(newNumbers);
    }
}

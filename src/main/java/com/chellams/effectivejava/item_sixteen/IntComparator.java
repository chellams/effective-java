package com.chellams.effectivejava.item_sixteen;

import java.util.Comparator;

public class IntComparator implements Comparator<Integer> {
    public static IntComparator INSTANCE = new IntComparator();
    @Override
    public int compare(Integer t1, Integer t2) {
        return t1.compareTo(t2);
    }
}

package com.chellams.effectivejava.item_sixteen;

import java.util.Comparator;

public class PrivateNumberComparator {
    private static class NewPrivateIntComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }
    }

    public static NewPrivateIntComparator INSTANCE = new NewPrivateIntComparator();
}

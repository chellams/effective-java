package com.chellams.effectivejava.item_sixteen;

public class StringLengthComparator {
    public static StringLengthComparator INSTANCE = new StringLengthComparator();

    private StringLengthComparator() {
    }

    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}

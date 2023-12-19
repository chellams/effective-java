package com.chellams.effectivejava.item_nine;

import com.chellams.effectivejava.item_four.InstantiationError;

public class PublicFields {
    private static final int HOUR_PER_DAY = 24;

    public final int hour;

    public PublicFields(int hour) {
        if (hour < 0 || hour > HOUR_PER_DAY) {
            throw new InstantiationError("given hour is invalid");
        }
        this.hour = hour;
    }
}

package com.chellams.effectivejava.item_twelve;

import com.chellams.effectivejava.item_eight.Data;

import java.util.Date;

public class Child extends Parent {

    Date date;

    public Child() {
        date = new Date();
    }

    @Override
    void overrideMethod() {
        System.out.println("date value " + date);
    }
}

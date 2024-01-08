package com.chellams.effectivejava.item_fifteen;

import com.chellams.effectivejava.item_thirteen.Rapper;

public class Circle extends Shape {

    private final float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

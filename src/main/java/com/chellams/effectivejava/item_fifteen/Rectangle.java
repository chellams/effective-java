package com.chellams.effectivejava.item_fifteen;

public class Rectangle extends Shape {

    private final float height;
    private final float width;

    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return height * width;
    }
}

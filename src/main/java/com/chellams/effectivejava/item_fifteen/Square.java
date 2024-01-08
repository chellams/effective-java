package com.chellams.effectivejava.item_fifteen;

/**
 * When we extend the already extended class, we don't need to override the methods.
 */
public class Square extends Rectangle {
    public Square(float height, float width) {
        super(height, width);
    }
}

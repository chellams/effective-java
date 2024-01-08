package com.chellams.effectivejava.item_fifteen;

/**
 * NOT RECOMMENDED APPROACH
 */
public class TaggedClass {

    enum SHAPE {
        CIRCLE,
        REACTANGLE
    }

    final SHAPE shape;

    public TaggedClass(SHAPE shape, float height, float width) {
        this.shape = shape;
        this.height = height;
        this.width = width;
    }

    public TaggedClass(SHAPE shape, float radius) {
        this.shape = shape;
        this.radius = radius;
    }

    float height;
    float width;

    float radius;

    public double area() {

        switch (shape) {
            case CIRCLE -> {
                return Math.PI * radius * radius;
            }
            case REACTANGLE -> {
                return width * height;
            }
        }

        return 0;
    }
}

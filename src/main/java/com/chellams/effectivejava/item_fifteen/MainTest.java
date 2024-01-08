package com.chellams.effectivejava.item_fifteen;

import javax.swing.text.html.HTML;

public class MainTest {

    public static void main(String[] args) {
        TaggedClass circle = new TaggedClass(TaggedClass.SHAPE.CIRCLE, 10);
        System.out.println("circle area " + circle.area());

        TaggedClass rectangle = new TaggedClass(TaggedClass.SHAPE.REACTANGLE, 20, 30);
        System.out.println("rectangle area " + rectangle.area());

        Shape newCircle = new Circle(10);
        Shape newRectangle = new Rectangle(10, 10);

        System.out.println("new circle area " + newCircle.area());
        System.out.println("new rectangle area " + newRectangle.area());

        Shape square = new Square(10, 34);
        System.out.println("reused rectangle @ square area " + square.area());
    }
}

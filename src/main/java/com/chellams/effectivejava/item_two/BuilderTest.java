package com.chellams.effectivejava.item_two;

public class BuilderTest {
    public static void main(String[] args) {
        Student student = new Student.Builder("Alice").build(); // phone and age is optional here
        System.out.println(student);

        student = new Student.Builder("Alice").phone("1234567890").build(); // with phone
        System.out.println(student);

        student = new Student.Builder("Alice").phone("1234567890").age(20).build(); // with phone and age
        System.out.println(student);
    }
}

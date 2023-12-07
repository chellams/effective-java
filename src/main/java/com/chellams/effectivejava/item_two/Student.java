package com.chellams.effectivejava.item_two;

public class Student {
    String name;
    String phone;
    int age;

    public static class Builder {
        String name; // Required
        String phone = ""; // Optional
        int age = 0; // Optional

        public Builder(String name) {
            this.name = name;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }

    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.phone = builder.phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }
}

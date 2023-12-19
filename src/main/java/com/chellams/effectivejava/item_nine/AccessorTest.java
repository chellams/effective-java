package com.chellams.effectivejava.item_nine;

public class AccessorTest {

    public static void main(String[] args) {
        Data data = new Data();
        data.setNumber(100);

        System.out.println(data.getNumber());

        PublicFields publicFields = new PublicFields(23);
        // publicFields.hour = 20; we can't write values to hour.
        System.out.println(publicFields.hour); // But we can read it.

        try {
            publicFields = new PublicFields(40); // When we initialize the hour with invalid values, error will
            // be thrown.
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}

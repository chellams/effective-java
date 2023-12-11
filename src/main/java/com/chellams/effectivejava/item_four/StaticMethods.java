package com.chellams.effectivejava.item_four;

public class StaticMethods {

    private StaticMethods() {
        throw new InstantiationError("This class cannot be instantiated");
    }

    public static String getTestMessage() {
        return "Test static method";
    }

    public static void main(String[] args) {
        try {
            StaticMethods staticMethods = new StaticMethods();
        } catch (Exception e) {
            System.out.println(" Result : " + e.getMessage().equals("This class cannot be instantiated"));
        }

    }
}

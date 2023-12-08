package com.chellams.effectivejava.item_three;

public class SingletonTest {
    public static void main(String[] args) {

        PublicStaticSingleton.INSTANCE.setName("public static singleton");
        System.out.println(PublicStaticSingleton.INSTANCE.getName());

        StaticFactorySingleton.getInstance().setName("static factory singleton");
        System.out.println(StaticFactorySingleton.getInstance().getName());

        LazySingleton.getInstance().setName("lazy singleton");
        System.out.println(LazySingleton.getInstance().getName());

        EnumSingleton.INSTANCE.setName("enum singleton");
        System.out.println(EnumSingleton.INSTANCE.getName());
    }
}

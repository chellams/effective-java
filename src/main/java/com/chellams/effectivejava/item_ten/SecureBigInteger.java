package com.chellams.effectivejava.item_ten;

import java.math.BigInteger;

public class SecureBigInteger {

    public static BigInteger safeBigInteger(BigInteger b) {
        if (b.getClass() != BigInteger.class) {
            return new BigInteger(b.toByteArray());
        }

        return b;
    }
}

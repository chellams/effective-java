package com.chellams.effectivejava.item_six;

public class EmptyStackError extends RuntimeException {
    public EmptyStackError(String message) {
        super(message);
    }
}

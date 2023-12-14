package com.chellams.effectivejava.item_six;

import java.util.Arrays;

public class CustomStack {
    private Object[] elements;
    private int size;

    private static final int DEFAULT_STACK_SIZE = 16;

    public CustomStack() {
        elements = new Object[DEFAULT_STACK_SIZE];
    }

    public void push(Object object) {
        ensureCapacity();
        elements[++size] = object;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackError("stack is empty");
        }
        // Here is a possibility of memory leaks. Because we are just decreasing the index and objects in the stacks
        // greater than the size index are still in active which are not needed anymore.
        return elements[size--];
    }

    public Object popFixed() {
        if (size == 0) {
            throw new EmptyStackError("stack is empty");
        }
        Object object = elements[size];
        // Popped object should be nulled out which would be cleaned up by garbage collector.
        elements[size--] = null;
        return object;
    }

    public void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * DEFAULT_STACK_SIZE + 1);
        }
    }

}

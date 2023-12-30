package com.chellams.effectivejava.item_eleven;

import java.util.Collection;
import java.util.HashSet;

public class ErrorHashsetImpl<E> extends HashSet<E> {
    private int addedCount = 0;

    public ErrorHashsetImpl() {
    }

    public ErrorHashsetImpl(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addedCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addedCount += c.size();
        return super.addAll(c);
    }

    public int getAddedCount() {
        return this.addedCount;
    }
}

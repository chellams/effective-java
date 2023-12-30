package com.chellams.effectivejava.item_eleven;

import java.util.Collection;
import java.util.Set;

public class ProperHashImpl<E> extends ForwardingSet<E> {

    private int addedCount = 0;

    public ProperHashImpl(Set<E> s) {
        super(s);
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
        return addedCount;
    }
}

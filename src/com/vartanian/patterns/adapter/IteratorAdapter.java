package com.vartanian.patterns.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by super on 10/29/15.
 */
public class IteratorAdapter implements Iterator {

    private Enumeration enumeration;

    public IteratorAdapter(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

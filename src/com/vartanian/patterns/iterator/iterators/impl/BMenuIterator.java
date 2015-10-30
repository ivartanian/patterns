package com.vartanian.patterns.iterator.iterators.impl;

import com.vartanian.patterns.iterator.items.MenuItem;
import com.vartanian.patterns.iterator.iterators.Iterator;

import java.util.ArrayList;

/**
 * Created by super on 10/30/15.
 */
public class BMenuIterator implements Iterator {

    private ArrayList<MenuItem> menuItems;
    private int currentPos=0;

    public BMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (currentPos >= menuItems.size() || menuItems.get(currentPos) == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return menuItems.get(currentPos++);
    }
}

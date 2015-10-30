package com.vartanian.patterns.iterator.iterators.impl;

import com.vartanian.patterns.iterator.items.MenuItem;
import com.vartanian.patterns.iterator.iterators.Iterator;

import java.util.ArrayList;

/**
 * Created by super on 10/30/15.
 */
public class DMenuIterator implements Iterator {

    private int currentPos = 0;
    private MenuItem[] menuItems;

    public DMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (currentPos >= menuItems.length || menuItems[currentPos] == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return menuItems[currentPos++];
    }
}

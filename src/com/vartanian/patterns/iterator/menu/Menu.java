package com.vartanian.patterns.iterator.menu;

import com.vartanian.patterns.iterator.items.MenuItem;
import com.vartanian.patterns.iterator.iterators.Iterator;
import com.vartanian.patterns.iterator.iterators.impl.DMenuIterator;

/**
 * Created by super on 10/30/15.
 */
public interface Menu {
    Iterator<MenuItem> createIterator();
}

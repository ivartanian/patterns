package com.vartanian.patterns.iterator.menu.impl;

import com.vartanian.patterns.iterator.items.MenuItem;
import com.vartanian.patterns.iterator.iterators.Iterator;
import com.vartanian.patterns.iterator.iterators.impl.BMenuIterator;
import com.vartanian.patterns.iterator.iterators.impl.DMenuIterator;
import com.vartanian.patterns.iterator.menu.Menu;

import java.util.ArrayList;

/**
 * Created by super on 10/30/15.
 */
public class BMenu implements Menu{

    private ArrayList<MenuItem> menuItems;

    public BMenu() {
        this.menuItems = new ArrayList<>();
        addMenu("Breakfast sandwich", 0.99);
        addMenu("Tea", 0.15);
        addMenu("Coffe", 0.20);
        addMenu("Breakfast gamburger", 0.59);
    }

    public void addMenu(String name, double price) {
        menuItems.add(new MenuItem(name, price));
    }

    public Iterator<MenuItem> createIterator(){
        return new BMenuIterator(menuItems);
    }


}

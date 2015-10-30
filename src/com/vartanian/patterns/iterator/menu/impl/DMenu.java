package com.vartanian.patterns.iterator.menu.impl;

import com.vartanian.patterns.iterator.items.MenuItem;
import com.vartanian.patterns.iterator.iterators.Iterator;
import com.vartanian.patterns.iterator.iterators.impl.DMenuIterator;
import com.vartanian.patterns.iterator.menu.Menu;

import java.util.ArrayList;

/**
 * Created by super on 10/30/15.
 */
public class DMenu implements Menu {

    private static final int MAX_ITEMS = 10;
    private int currentPos = 0;
    private MenuItem[] menuItems;

    public DMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];
        addMenu("Dinner sandwich", 0.99);
        addMenu("Beer", 0.15);
        addMenu("Water", 0.20);
        addMenu("Dinner gamburger", 0.59);
    }

    public void addMenu(String name, double price) {
        if (currentPos >= MAX_ITEMS){
            System.out.println("Menu is full. Can not add new item.");
            return;
        }
        menuItems[currentPos++] = new MenuItem(name, price);
    }

    public Iterator<MenuItem> createIterator(){
        return new DMenuIterator(menuItems);
    }

}

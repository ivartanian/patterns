package com.vartanian.patterns.composite.waiters;

import com.vartanian.patterns.composite.components.MenuComponent;
import com.vartanian.patterns.iterator.items.MenuItem;
import com.vartanian.patterns.iterator.iterators.Iterator;
import com.vartanian.patterns.iterator.menu.Menu;

import java.util.List;

/**
 * Created by super on 10/30/15.
 */
public class Waiter {

    private MenuComponent allComponents;

    public Waiter(MenuComponent allComponents) {
        this.allComponents = allComponents;
    }

    public void printMenu(){
        allComponents.print("");
    }

}

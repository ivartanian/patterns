package com.vartanian.patterns.iterator.waiters;

import com.vartanian.patterns.iterator.items.MenuItem;
import com.vartanian.patterns.iterator.iterators.Iterator;
import com.vartanian.patterns.iterator.menu.Menu;
import com.vartanian.patterns.iterator.menu.impl.BMenu;
import com.vartanian.patterns.iterator.menu.impl.DMenu;

import java.util.List;

/**
 * Created by super on 10/30/15.
 */
public class Waiter {

    private List<Menu> menuList;

    public Waiter(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public void printMenu(){
        java.util.Iterator<Menu> iterator = menuList.iterator();
        while (iterator.hasNext()){
            printMenu(iterator.next().createIterator());
        }
    }

    public void printMenu(Iterator<MenuItem> iterator){
        while (iterator.hasNext()){
            MenuItem item = iterator.next();
            System.err.println(item.getName() + " - " + item.getPrice());
        }
    }
}

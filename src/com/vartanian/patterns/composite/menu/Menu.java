package com.vartanian.patterns.composite.menu;

import com.vartanian.patterns.composite.components.MenuComponent;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by super on 10/30/15.
 */
public class Menu extends MenuComponent {

    private ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    private String name;

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print(String space) {
        System.out.println(space + "Menu: " + getName());
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent component = iterator.next();
            component.print(space + " ");
        }
    }
}

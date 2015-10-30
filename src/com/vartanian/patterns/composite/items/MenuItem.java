package com.vartanian.patterns.composite.items;

import com.vartanian.patterns.composite.components.MenuComponent;

/**
 * Created by super on 10/30/15.
 */
public class MenuItem extends MenuComponent {

    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print(String space) {
        System.out.println(space + getName() + " - " + getPrice());
    }
}

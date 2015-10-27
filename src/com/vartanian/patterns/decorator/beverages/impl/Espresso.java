package com.vartanian.patterns.decorator.beverages.impl;

import com.vartanian.patterns.decorator.beverages.Beverage;

/**
 * Created by super on 10/27/15.
 */
public class Espresso extends Beverage{

    public Espresso() {
        setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

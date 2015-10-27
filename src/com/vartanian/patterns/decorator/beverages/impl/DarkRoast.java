package com.vartanian.patterns.decorator.beverages.impl;

import com.vartanian.patterns.decorator.beverages.Beverage;

/**
 * Created by super on 10/27/15.
 */
public class DarkRoast extends Beverage{

    public DarkRoast() {
        setDescription("Dark roast");
    }

    @Override
    public double cost() {
        return 0.55;
    }
}

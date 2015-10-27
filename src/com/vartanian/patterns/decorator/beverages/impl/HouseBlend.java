package com.vartanian.patterns.decorator.beverages.impl;

import com.vartanian.patterns.decorator.beverages.Beverage;

/**
 * Created by super on 10/27/15.
 */
public class HouseBlend extends Beverage{

    public HouseBlend() {
        setDescription("House blend");
    }

    @Override
    public double cost() {
        return 0.89;
    }
}

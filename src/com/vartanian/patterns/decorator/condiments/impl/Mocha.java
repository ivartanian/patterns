package com.vartanian.patterns.decorator.condiments.impl;

import com.vartanian.patterns.decorator.beverages.Beverage;
import com.vartanian.patterns.decorator.condiments.CondimentDecorator;

/**
 * Created by super on 10/27/15.
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}

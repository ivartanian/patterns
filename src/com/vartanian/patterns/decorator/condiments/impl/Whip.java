package com.vartanian.patterns.decorator.condiments.impl;

import com.vartanian.patterns.decorator.beverages.Beverage;
import com.vartanian.patterns.decorator.condiments.CondimentDecorator;

/**
 * Created by super on 10/27/15.
 */
public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.50 + beverage.cost();
    }
}

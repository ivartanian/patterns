package com.vartanian.patterns.decorator.condiments.impl;

import com.vartanian.patterns.decorator.beverages.Beverage;
import com.vartanian.patterns.decorator.condiments.CondimentDecorator;

/**
 * Created by super on 10/27/15.
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}

package com.vartanian.patterns.decorator.condiments;

import com.vartanian.patterns.decorator.beverages.Beverage;

/**
 * Created by super on 10/27/15.
 */
public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract String getDescription();

}

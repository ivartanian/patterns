package com.vartanian.patterns.decorator.beverages;

/**
 * Created by super on 10/27/15.
 */
public abstract class Beverage {

    private String description = "Unknown beverage";

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}

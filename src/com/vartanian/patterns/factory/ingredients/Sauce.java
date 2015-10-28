package com.vartanian.patterns.factory.ingredients;

/**
 * Created by super on 10/28/15.
 */
public abstract class Sauce {

    protected String name;

    public Sauce(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}

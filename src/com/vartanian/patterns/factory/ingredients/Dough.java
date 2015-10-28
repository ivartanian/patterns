package com.vartanian.patterns.factory.ingredients;

/**
 * Created by super on 10/28/15.
 */
public abstract class Dough {

    protected String name;

    public Dough(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

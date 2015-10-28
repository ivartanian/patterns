package com.vartanian.patterns.factory.pizza;

import com.vartanian.patterns.factory.ingredients.Cheese;
import com.vartanian.patterns.factory.ingredients.Dough;
import com.vartanian.patterns.factory.ingredients.Sauce;
import com.vartanian.patterns.factory.ingredientsfacrory.PizzaIngredientFactory;

import java.util.logging.Logger;

/**
 * Created by super on 10/28/15.
 */
public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected PizzaIngredientFactory pizzaIngredientFactory;

    public Pizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public abstract void prepare();

    public void bake(){
        Logger.getLogger(this.getClass().getName()).info("Bake for 25 min at 350");
    }

    public void cut(){
        Logger.getLogger(this.getClass().getName()).info("Cutting the pizza into diagonal slices");
    }

    public void box(){
        Logger.getLogger(this.getClass().getName()).info("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

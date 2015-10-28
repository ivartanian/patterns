package com.vartanian.patterns.factory.ingredientsfacrory.impl;

import com.vartanian.patterns.factory.ingredients.Cheese;
import com.vartanian.patterns.factory.ingredients.Dough;
import com.vartanian.patterns.factory.ingredients.Sauce;
import com.vartanian.patterns.factory.ingredients.impl.NYCheese;
import com.vartanian.patterns.factory.ingredients.impl.NYDough;
import com.vartanian.patterns.factory.ingredients.impl.SauceAll;
import com.vartanian.patterns.factory.ingredientsfacrory.PizzaIngredientFactory;

/**
 * Created by super on 10/28/15.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new NYCheese("NY Cheese");
    }

    @Override
    public Dough createDough() {
        return new NYDough("NY Dough");
    }

    @Override
    public Sauce createSauce() {
        return new SauceAll("All sauce");
    }
}

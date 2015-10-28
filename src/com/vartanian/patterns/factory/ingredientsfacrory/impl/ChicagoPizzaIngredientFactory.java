package com.vartanian.patterns.factory.ingredientsfacrory.impl;

import com.vartanian.patterns.factory.ingredients.Cheese;
import com.vartanian.patterns.factory.ingredients.Dough;
import com.vartanian.patterns.factory.ingredients.Sauce;
import com.vartanian.patterns.factory.ingredients.impl.*;
import com.vartanian.patterns.factory.ingredientsfacrory.PizzaIngredientFactory;

/**
 * Created by super on 10/28/15.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new ChicagoCheese("Chicago Cheese");
    }

    @Override
    public Dough createDough() {
        return new ChicagoDough("Checago Dough");
    }

    @Override
    public Sauce createSauce() {
        return new SauceAll("All sauce");
    }
}

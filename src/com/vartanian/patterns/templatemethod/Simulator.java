package com.vartanian.patterns.templatemethod;

import com.vartanian.patterns.strategy.entitys.Duck;
import com.vartanian.patterns.strategy.entitys.MallardDuck;
import com.vartanian.patterns.templatemethod.beverages.CoffeineBeverageWithHook;
import com.vartanian.patterns.templatemethod.beverages.impl.CoffeWithHook;

public class Simulator {

    public static void main(String[] args) {

        CoffeineBeverageWithHook coffeWithHook = new CoffeWithHook();

        coffeWithHook.prepareRecipe();

    }

}

package com.vartanian.patterns.iterator;

import com.vartanian.patterns.iterator.menu.impl.BMenu;
import com.vartanian.patterns.iterator.menu.impl.DMenu;
import com.vartanian.patterns.iterator.waiters.Waiter;
import com.vartanian.patterns.templatemethod.beverages.CoffeineBeverageWithHook;
import com.vartanian.patterns.templatemethod.beverages.impl.CoffeWithHook;

import java.util.ArrayList;
import java.util.Arrays;

public class Simulator {

    public static void main(String[] args) {

        BMenu bMenu = new BMenu();
        DMenu dMenu = new DMenu();

        Waiter waiter = new Waiter(Arrays.asList(bMenu, dMenu));
        waiter.printMenu();

    }

}

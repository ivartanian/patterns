package com.vartanian.patterns.templatemethod.beverages.impl;

import com.vartanian.patterns.templatemethod.beverages.CoffeineBeverageWithHook;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by super on 10/29/15.
 */
public class CoffeWithHook extends CoffeineBeverageWithHook {
    @Override
    protected void brew() {
        System.out.println("Dripping coffe through filter...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Add sugar and milk...");
    }

    @Override
    protected boolean consumerWantCondiments() {
        String input = getUserInput();

        if (input.toLowerCase().startsWith("y")){
            return true;
        }
        return false;
    }

    private String getUserInput() {
        String answer;
        System.out.println("Would you like milk and sugar with your coffe (y/n)?");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = bufferedReader.readLine();
        } catch (IOException e) {
            return "no";
        }

        return answer;
    }
}

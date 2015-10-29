package com.vartanian.patterns.singleton;

public class Simulator {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        Singleton instance = Singleton.getInstance();
        EnumSingleton instance1 = EnumSingleton.INSTANCE;

    }

}

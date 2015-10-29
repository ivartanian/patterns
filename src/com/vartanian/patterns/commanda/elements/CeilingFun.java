package com.vartanian.patterns.commanda.elements;

/**
 * Created by super on 10/29/15.
 */
public class CeilingFun {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int SLOW = 1;
    public static final int OFF = 0;

    private int speed;

    public CeilingFun() {
        this.speed = OFF;
    }

    public void high(){
        this.speed = HIGH;
        System.out.println("Ceiling fun high...");
    };

    public void medium(){
        this.speed = MEDIUM;
        System.out.println("Ceiling fun medium...");
    };

    public void slow(){
        this.speed = SLOW;
        System.out.println("Ceiling fun slow...");
    };

    public void off(){
        this.speed = OFF;
        System.out.println("Ceiling fun off...");
    };

    public int getSpeed() {
        return speed;
    }
}

package com.vartanian.patterns.state.machine;

import com.vartanian.patterns.state.states.State;
import com.vartanian.patterns.state.states.impl.HasQuarterState;
import com.vartanian.patterns.state.states.impl.NoQuarterState;
import com.vartanian.patterns.state.states.impl.SoldState;

/**
 * Created by super on 11/2/15.
 */
public class GumballMachine {

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;

    private State state = soldOutState;
    private int count = 0;

    public GumballMachine(int count) {
        this.noQuarterState = new NoQuarterState(this);
        this.soldOutState = new SoldState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.count = count;
        if (count > 0){
            state = noQuarterState;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispence();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot");
        if (count != 0){
            count--;
        }
    }
}

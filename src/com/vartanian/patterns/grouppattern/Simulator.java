package com.vartanian.patterns.grouppattern;

import com.vartanian.patterns.grouppattern.behaviors.counters.QuackCounter;
import com.vartanian.patterns.grouppattern.factories.AbstractDuckFactory;
import com.vartanian.patterns.grouppattern.factories.impl.CountingDuckFactory;
import com.vartanian.patterns.grouppattern.factories.impl.GeeseFactory;
import com.vartanian.patterns.grouppattern.behaviors.quacking.Quackable;
import com.vartanian.patterns.grouppattern.fowls.flock.Flock;
import com.vartanian.patterns.grouppattern.observables.Quackologist;

public class Simulator {

    public Simulator() {
    }

    public static void main(String[] args) {

        Simulator simulator = new Simulator();
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();

        simulator.simulate(countingDuckFactory);

    }

    public void simulate(AbstractDuckFactory abstractDuckFactory) {

        Quackable duckCall = abstractDuckFactory.createDuckCall();
        Quackable redheadDuck = abstractDuckFactory.createRedheadDuck();
        Quackable rubberDuck = abstractDuckFactory.createRubberDuck();
        Quackable gooseAdapter = new GeeseFactory().createGoose();

        Flock flockDifferent = new Flock();
        flockDifferent.add(duckCall);
        flockDifferent.add(redheadDuck);
        flockDifferent.add(rubberDuck);
        flockDifferent.add(gooseAdapter);

        Flock flock = new Flock();
        flock.add(abstractDuckFactory.createMallardDuck());
        flock.add(abstractDuckFactory.createMallardDuck());
        flock.add(abstractDuckFactory.createMallardDuck());
        flock.add(abstractDuckFactory.createMallardDuck());

        flockDifferent.add(flock);

        Quackologist quackologist = new Quackologist();
        flockDifferent.registerObserveble(quackologist);

        simulate(flockDifferent);

        System.out.println("All quacks: " + QuackCounter.getCount());

    }

    public void simulate(Quackable quackable) {
        quackable.quack();
    }

}

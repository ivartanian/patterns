package com.vartanian.patterns.grouppattern.fowls.flock;

import com.vartanian.patterns.grouppattern.behaviors.quacking.Quackable;
import com.vartanian.patterns.grouppattern.observables.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by super on 11/3/15.
 */
public class Flock implements Quackable {

    List<Quackable> quackables = new ArrayList<>();

    public void add(Quackable duck) {
        quackables.add(duck);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackables.iterator();
        while (iterator.hasNext()){
            Quackable next = iterator.next();
            next.quack();
        }
    }

    @Override
    public void registerObserveble(Observer observer) {
        Iterator<Quackable> iterator = quackables.iterator();
        while (iterator.hasNext()){
            Quackable next = iterator.next();
            next.registerObserveble(observer);
        }

    }

    @Override
    public void notifyObservers() {
//        Iterator<Quackable> iterator = quackables.iterator();
//        while (iterator.hasNext()){
//            Quackable next = iterator.next();
//            next.notifyObservers();
//        }

    }
}

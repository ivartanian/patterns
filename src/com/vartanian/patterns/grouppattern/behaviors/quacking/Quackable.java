package com.vartanian.patterns.grouppattern.behaviors.quacking;

import com.vartanian.patterns.grouppattern.observables.QuackObservable;

/**
 * Created by super on 10/27/15.
 */
public interface Quackable extends QuackObservable {
    void quack();
}

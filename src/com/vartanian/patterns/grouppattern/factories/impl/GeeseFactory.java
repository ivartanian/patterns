package com.vartanian.patterns.grouppattern.factories.impl;

import com.vartanian.patterns.grouppattern.adapters.GooseAdapter;
import com.vartanian.patterns.grouppattern.behaviors.quacking.Quackable;
import com.vartanian.patterns.grouppattern.factories.AbstractGeeseFactory;
import com.vartanian.patterns.grouppattern.fowls.Goose;

/**
 * Created by super on 11/3/15.
 */
public class GeeseFactory extends AbstractGeeseFactory {
    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }
}

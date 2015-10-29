package com.vartanian.patterns.commanda.commands.impl;

import com.vartanian.patterns.commanda.commands.Command;
import com.vartanian.patterns.commanda.elements.Fun;
import com.vartanian.patterns.commanda.elements.Light;

/**
 * Created by super on 10/29/15.
 */
public class FunOffCommand implements Command {

    private Fun fun;

    public FunOffCommand(Fun fun) {
        this.fun = fun;
    }

    @Override
    public void execute() {
        fun.off();
    }

    @Override
    public void undo() {
        fun.on();
    }
}

package com.vartanian.patterns.commanda.commands.impl;

import com.vartanian.patterns.commanda.commands.Command;
import com.vartanian.patterns.commanda.elements.Fun;

/**
 * Created by super on 10/29/15.
 */
public class FunOnCommand implements Command {

    private Fun fun;

    public FunOnCommand(Fun fun) {
        this.fun = fun;
    }

    @Override
    public void execute() {
        fun.on();
    }

    @Override
    public void undo() {
        fun.off();
    }
}

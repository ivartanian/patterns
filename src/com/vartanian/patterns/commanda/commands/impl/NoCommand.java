package com.vartanian.patterns.commanda.commands.impl;

import com.vartanian.patterns.commanda.commands.Command;
import com.vartanian.patterns.commanda.elements.Fun;

/**
 * Created by super on 10/29/15.
 */
public class NoCommand implements Command {

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}

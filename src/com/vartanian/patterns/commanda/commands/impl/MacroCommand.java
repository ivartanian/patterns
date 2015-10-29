package com.vartanian.patterns.commanda.commands.impl;

import com.vartanian.patterns.commanda.commands.Command;

/**
 * Created by super on 10/29/15.
 */
public class MacroCommand implements Command {

    private Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }
}

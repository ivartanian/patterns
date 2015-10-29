package com.vartanian.patterns.commanda.controllers;

import com.vartanian.patterns.commanda.commands.Command;
import com.vartanian.patterns.commanda.commands.impl.NoCommand;

/**
 * Created by super on 10/29/15.
 */
public class RemoteControl {

    private Command[] onCommand;
    private Command[] offCommand;

    private Command lastCommand;

    public RemoteControl() {
        onCommand = new Command[5];
        offCommand = new Command[5];
        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < 5; i++) {
            onCommand[i] = noCommand;
            offCommand[i] = noCommand;
        }
        lastCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        if (slot >= this.onCommand.length){
            return;
        }

        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommand;

    }

    public void buttonOnWasPressed(int slot){
        if (slot >= this.onCommand.length){
            return;
        }

        this.onCommand[slot].execute();
        lastCommand = this.onCommand[slot];
    }

    public void buttonOffWasPressed(int slot){
        if (slot >= this.offCommand.length){
            return;
        }

        this.offCommand[slot].execute();
        lastCommand = this.offCommand[slot];
    }

    public void buttonUndoWasPressed(){
        if (lastCommand == null) return;
        lastCommand.undo();
    }

}

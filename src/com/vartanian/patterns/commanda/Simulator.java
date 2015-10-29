package com.vartanian.patterns.commanda;

import com.vartanian.patterns.commanda.commands.Command;
import com.vartanian.patterns.commanda.commands.impl.*;
import com.vartanian.patterns.commanda.controllers.RemoteControl;
import com.vartanian.patterns.commanda.elements.CeilingFun;
import com.vartanian.patterns.commanda.elements.Fun;
import com.vartanian.patterns.commanda.elements.Light;

public class Simulator {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);

        Fun fun = new Fun();
        FunOnCommand funOnCommand = new FunOnCommand(fun);
        FunOffCommand funOffCommand = new FunOffCommand(fun);

        remoteControl.setCommand(1, funOnCommand, funOffCommand);

        CeilingFun ceilingFun = new CeilingFun();
        CeilingFunHighCommand ceilingFunHighCommand = new CeilingFunHighCommand(ceilingFun);
        CeilingFunSlowCommand ceilingFunSlowCommand = new CeilingFunSlowCommand(ceilingFun);
        CeilingFunOffCommand ceilingFunOffCommand = new CeilingFunOffCommand(ceilingFun);

        remoteControl.setCommand(2, ceilingFunHighCommand, ceilingFunOffCommand);
        remoteControl.setCommand(3, ceilingFunSlowCommand, ceilingFunOffCommand);

        remoteControl.buttonOnWasPressed(0);
        remoteControl.buttonOnWasPressed(1);
        remoteControl.buttonOffWasPressed(0);
        remoteControl.buttonOffWasPressed(1);
        remoteControl.buttonOnWasPressed(2);
        remoteControl.buttonOffWasPressed(2);
        remoteControl.buttonUndoWasPressed();
        remoteControl.buttonOnWasPressed(3);

        System.out.println("------------Macro commands---------------");

        Command[] onCommands = {lightOnCommand, funOnCommand, ceilingFunSlowCommand};
        Command[] offCommands = {lightOffCommand, funOffCommand, ceilingFunOffCommand};
        MacroCommand macroCommandOn = new MacroCommand(onCommands);
        MacroCommand macroCommandOff = new MacroCommand(offCommands);

        remoteControl.setCommand(4, macroCommandOn, macroCommandOff);

        remoteControl.buttonOnWasPressed(4);
        remoteControl.buttonUndoWasPressed();


    }

}

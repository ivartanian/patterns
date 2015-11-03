package com.vartanian.patterns.proxy.remote;

import com.vartanian.patterns.proxy.remote.machine.GumballMachine;
import com.vartanian.patterns.proxy.remote.machine.GumballMachineRemote;

import java.rmi.Naming;

public class Simulator {

    public static void main(String[] args) {

        GumballMachineRemote gumballMachine;

        int count;
        if (args.length < 2){
            System.out.println("Gumball machine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}

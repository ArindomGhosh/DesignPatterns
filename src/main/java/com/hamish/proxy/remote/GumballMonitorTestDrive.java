package com.hamish.proxy.remote;

import java.rmi.Naming;

/**
 * Created by hamishdickson on 28/12/14.
 * 
 * Proxy pattern: provides a surrogate or placeholder for another
 * object to control access to it
 */
public class GumballMonitorTestDrive {

    public static void main(String[] args) {
        String[] location = {"rmi://santafe.mightygumball.com/gumballmachine",
                "rmi://boulder.mightygumball.com/gumballmachine",
                "rmi://seattle.mightygumball.com/gumballmachine"};

        GumballMonitor[] monitor = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote machineRemote = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machineRemote);
                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < monitor.length; i++) {
            monitor[i].report();
        }
    }
}

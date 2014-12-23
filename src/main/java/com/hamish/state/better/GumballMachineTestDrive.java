package com.hamish.state.better;

/**
 * Created by hamishdickson on 23/12/14.
 *
 * The State pattern: allows an object to alter it's behavior
 * when its internal state changes. The object will appear to
 * change it's class.
 *
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}

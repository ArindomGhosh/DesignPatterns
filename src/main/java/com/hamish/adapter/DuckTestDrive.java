package com.hamish.adapter;

/**
 * Created by hamishdickson on 15/12/14.
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        /**
         * lets see what the direct turkey does
         */
        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe duck says...");
        testDuck(duck);

        /**
         * now lets test the turkey - notice how it comes out
         * differently from testing turkey directly
         */
        System.out.println("\nThe turkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    /**
     * our method which uses duck - it runs both quack and fly
     * @param duck
     */
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}

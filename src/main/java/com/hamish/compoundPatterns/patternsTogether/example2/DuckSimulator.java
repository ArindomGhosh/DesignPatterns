package com.hamish.compoundPatterns.patternsTogether.example2;

/**
 * Created by hamishdickson on 05/01/15.
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        // same code from now on
        System.out.println("\nDuck simulator: with abstract factory");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        // once it's wrapped, can treat it like a duck!
        simulate(gooseDuck);

        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}

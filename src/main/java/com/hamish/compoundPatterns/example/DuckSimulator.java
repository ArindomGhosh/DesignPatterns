package com.hamish.compoundPatterns.example;

/**
 * Created by hamishdickson on 05/01/15.
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    private void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new ReadheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        // make a goose that acts like a ducky
        Quackable gooseDuck = new GooseAdapter(new Goose());

        // could have used the original, but I'd like to keep it there for ref
        Quackable mallardDuckQuack = new QuackCounter(new MallardDuck());
        Quackable redheadDuckQuack = new QuackCounter(new ReadheadDuck());
        Quackable duckCallQuack = new QuackCounter(new DuckCall());
        Quackable rubberDuckQuack = new QuackCounter(new RubberDuck());
        // let's not care about the goose!


        System.out.println("\nDuck simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        // once it's wrapped, can treat it like a duck!
        simulate(gooseDuck);

        simulate(mallardDuckQuack);
        simulate(redheadDuckQuack);
        simulate(duckCallQuack);
        simulate(rubberDuckQuack);

        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}

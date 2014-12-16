package com.hamish.template.arrays;

import java.util.Arrays;

/**
 * Created by hamishdickson on 16/12/14.
 *
 * So, sort is kind of like a template method - you have to implement comparable (see Duck).
 * Then, the rest of sort()s details are fixed
 *
 * normally a template method is in a class you subclass, but this is the same concept
 */
public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 2)
        };

        System.out.println("Before sorting");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nAfter sorting:");
        display(ducks);
    }

    private static void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }
}

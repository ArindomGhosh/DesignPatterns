package com.hamish.template.hooks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hamishdickson on 16/12/14.
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        }
        return false;
    }

    private String getUserInput() {
        String answer = null;

        System.out.print("Would you like milk and sugar with your coffee (y/n)?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        if (answer == null) {
            return "no";
        }
        return answer;
    }
}

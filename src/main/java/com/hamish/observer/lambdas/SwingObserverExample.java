package com.hamish.observer.lambdas;

import javax.swing.*;

/**
 * Created by hamishdickson on 06/12/14.
 *
 * Observer pattern using lambdas
 */
public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    private void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");

        // make angel and devil listeners (ie observers) of the pattern
        button.addActionListener(event ->
                        System.out.println("Don't do it, you might regret it!"));
        button.addActionListener(event ->
                        System.out.println("Come on, do it!"));

        // set some frame properties here
    }

    /*
     * here, actionPerformed() is like update()
     */

    // don't need these with lambdas
/*    private class AngelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("Don't do it, you might regret it!");
        }
    }

    private class DevilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("Come on, do it!");
        }
    }*/
}

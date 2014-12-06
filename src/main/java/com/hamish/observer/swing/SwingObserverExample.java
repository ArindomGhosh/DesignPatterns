package com.hamish.observer.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by hamishdickson on 06/12/14.
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
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());

        // set some frame properties here
    }

    /*
     * here, actionPerformed() is like update()
     */

    private class AngelListener implements ActionListener {
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
    }
}

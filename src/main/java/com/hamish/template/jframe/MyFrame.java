package com.hamish.template.jframe;

import javax.swing.*;
import java.awt.*;

/**
 * Created by hamishdickson on 16/12/14.
 *
 * JFrame contains a method update() that controls the algorithm for
 * updating the screen. we can override the paint hook
 */
public class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        String msg = "I rule!";
        graphics.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("Hamish rulz");
    }
}

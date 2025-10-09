package Swing;

import javax.swing.*;

public class p1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("My first swing project");
        JButton b = new JButton("click me!");
        f.add(b);
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

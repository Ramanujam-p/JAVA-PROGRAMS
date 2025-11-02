import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Addapp extends JFrame {
    Addapp() {
        super("Add application");
        getContentPane().setBackground(Color.CYAN);
        JLabel l1, l2, l3;
        JTextField t1, t2, t3;
        JButton b1, b2;
        l1 = new JLabel("enter First number:");
        l2 = new JLabel("enter Second number:");
        l3 = new JLabel("Result:");
        t1 = new JTextField(15);
        t2 = new JTextField(15);
        t3 = new JTextField(15);
        b1 = new JButton("Add");
        b2 = new JButton("clear");
        l1.setBackground(Color.YELLOW);
        l2.setBackground(Color.YELLOW);
        l3.setBackground(Color.YELLOW);
        t1.setBackground(Color.PINK);
        t2.setBackground(Color.PINK);
        t3.setBackground(Color.PINK);
        b1.setBackground(Color.ORANGE);
        b1.setBackground(Color.ORANGE);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        b1.addActionListener(e -> {
            try {
                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());
                int s = n1 + n2;
                t3.setText(String.valueOf(s));
            } catch (NumberFormatException f) {
                JOptionPane.showMessageDialog(this, "please enter valid inputs", "error", JOptionPane.ERROR_MESSAGE);
            }
        });
        b2.addActionListener(e -> {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t1.requestFocus();
        });
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Addapp();
    }
}

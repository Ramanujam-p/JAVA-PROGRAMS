import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Program10 extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2;

    Program10() {
        super("addition program");
        setLayout(new GridLayout());
        l1 = new JLabel("enter first number:");
        l2 = new JLabel("enter second number:");
        l3 = new JLabel("Result:");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        b1 = new JButton("add");
        b2 = new JButton("clear");
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        setVisible(true);
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a + b;
            t3.setText(String.valueOf(c));
        } else if (e.getSource() == b2) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t1.requestFocus();
        }
    }

    public static void main(String[] args) {
        new Program10();
    }
}

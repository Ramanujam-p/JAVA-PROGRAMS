import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Program2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Addition app");
        f.setLayout(new FlowLayout());
        JLabel l1 = new JLabel("First number:");
        JLabel l2 = new JLabel("Second number:");
        JLabel l3 = new JLabel("Result:");
        JTextField t1 = new JTextField(15);
        JTextField t2 = new JTextField(15);
        JTextField t3 = new JTextField(15);
        JButton b1 = new JButton("Add");
        JButton b2 = new JButton("Clear");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e1) {
                try {
                    int a = Integer.parseInt(t1.getText());
                    int b = Integer.parseInt(t2.getText());
                    int sum = a + b;
                    t3.setText(String.valueOf(sum));
                } catch (NumberFormatException h) {
                    JOptionPane.showMessageDialog(f, "please enter valid inputs!", "error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e4) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t1.requestFocus();
            }
        });
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(b1);
        f.add(b2);
        f.setVisible(true);
        f.setLocationRelativeTo(f);
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
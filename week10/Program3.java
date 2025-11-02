import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Program3 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Login form");
        f.setLayout(new FlowLayout());
        JLabel l1 = new JLabel("Name:");
        JLabel l2 = new JLabel("Email:");
        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        JButton b1 = new JButton("submit");
        JButton b2 = new JButton("clear");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e1) {
                String name = t1.getText();
                String email = t2.getText();
                if (name.isEmpty() || email.isEmpty()) {
                    JOptionPane.showMessageDialog(f, "please fill all fields", "error", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(f, "submitted successfullly\n Name:" + name + "\nemail:" + email,
                            "success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e2) {
                t1.setText("");
                t2.setText("");
                t1.requestFocus();
            }
        });
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.setVisible(true);
        f.setSize(300, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
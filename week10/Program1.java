import javax.swing.*;
import java.awt.event.*;

class MyListener implements ActionListener {
    JLabel label;

    MyListener(JLabel l) {
        label = l;
    }

    public void actionPerformed(ActionEvent e) {
        label.setText("hello I am rama");
    }
}

public class Program1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("my first program");
        JLabel l = new JLabel();
        JButton b = new JButton("click");
        l.setText("if you click the button,you know who I am?");
        f.setLayout(null);
        l.setBounds(100, 100, 500, 30);
        b.setBounds(120, 160, 100, 30);
        MyListener a = new MyListener(l);
        b.addActionListener(a);
        f.add(l);
        f.add(b);
        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
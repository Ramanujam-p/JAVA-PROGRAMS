import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AddApplication extends JFrame implements ActionListener {
    JLabel firstLabel, secondLabel, resultLabel;
    JTextField firstText, secondText, sumText;
    JButton add, clear;

    AddApplication() {
        firstLabel = new JLabel("First Number");
        firstLabel.setFont(new Font("Arial", Font.BOLD, 20));
        firstLabel.setForeground(Color.pink);
        firstLabel.setBackground(Color.gray);
        secondLabel = new JLabel("Second Number");
        secondLabel.setFont(new Font("Arial", Font.BOLD, 20));
        secondLabel.setForeground(Color.blue);
        secondLabel.setBackground(Color.white);
        resultLabel = new JLabel("Sum");
        resultLabel = new JLabel("Result");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 20));
        resultLabel.setForeground(Color.blue);
        firstText = new JTextField(10);
        secondText = new JTextField(10);
        sumText = new JTextField(10);
        add = new JButton("Add");
        clear = new JButton("Clear");
        add(firstLabel);
        add(firstText);
        add(secondLabel);
        add(secondText);
        add(resultLabel);
        add(sumText);
        add(add);
        add(clear);
        setLayout(new FlowLayout());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add.addActionListener(this);
        clear.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            String A = firstText.getText().trim();
            String B = secondText.getText().trim();
            int sum = Integer.parseInt(A) + Integer.parseInt(B);
            sumText.setText(String.valueOf(sum));
        }
        if (e.getSource() == clear) {
            firstText.setText(" ");
            secondText.setText(" ");
            sumText.setText(" ");
        }

    }

    public static void main(String[] args) {
        System.out.println("Name:P.RAMANUJAM ROLL NO:2024503525");
        new AddApplication();
    }

}

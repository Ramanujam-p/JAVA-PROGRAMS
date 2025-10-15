import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginAuthentication extends JFrame implements ActionListener {
    JLabel firstLabel, secondLabel, resultLabel;
    JTextField firstText, secondText;
    JTextArea result;
    JButton submitButton, clearButton;

    LoginAuthentication() {
        firstLabel = new JLabel("Enter user name");
        firstLabel.setFont(new Font("Arial", Font.BOLD, 14));
        firstLabel.setForeground(Color.pink);

        secondLabel = new JLabel("Enter password");
        secondLabel.setFont(new Font("Arial", Font.BOLD, 14));
        secondLabel.setForeground(Color.blue);

        resultLabel = new JLabel("Result");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));
        resultLabel.setForeground(Color.blue);

        firstText = new JTextField(10);
        secondText = new JTextField(10);

        result = new JTextArea(5, 20);
        result.setEditable(false);
        result.setLineWrap(true);
        result.setWrapStyleWord(true);

        submitButton = new JButton("Submit");
        clearButton = new JButton("Clear");

        // Layout setup
        setLayout(new FlowLayout());
        add(firstLabel);
        add(firstText);
        add(secondLabel);
        add(secondText);
        add(resultLabel);
        add(new JScrollPane(result)); // add with scroll pane
        add(submitButton);
        add(clearButton);

        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        submitButton.addActionListener(this);
        clearButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            StringBuilder error = new StringBuilder();

            String name = firstText.getText().trim();
            if (name.isEmpty() || name.length() < 3) {
                error.append("Error: Username length should be at least 3 characters.\n");
            }

            String password = secondText.getText();
            boolean hasDigit = false;
            boolean hasUpper = false;

            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    hasDigit = true;
                }
                if (Character.isUpperCase(password.charAt(i))) {
                    hasUpper = true;
                }
            }

            if (!hasDigit) {
                error.append("Error: Password must contain at least one digit.\n");
            }
            if (!hasUpper) {
                error.append("Error: Password must contain at least one uppercase letter.\n");
            }

            if (error.length() == 0) {
                result.setText("Account created successfully!");
            } else {
                result.setText(error.toString());
            }
        } else if (e.getSource() == clearButton) {
            firstText.setText("");
            secondText.setText("");
            result.setText("");
        }
    }

    public static void main(String[] args) {
        System.out.println("Name:P.RAMANUJAM ROLL NO:2024503525");
        new LoginAuthentication();
    }
}
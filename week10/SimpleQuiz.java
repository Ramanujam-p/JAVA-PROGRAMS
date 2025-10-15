import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleQuiz extends JFrame implements ActionListener {
    JLabel q1, q2, q3;
    JRadioButton r1a, r1b, r1c;
    JCheckBox c2a, c2b, c2c;
    JTextField t3;
    JTextArea result;
    JButton submit, show;
    ButtonGroup g1;
    int score = 0;

    SimpleQuiz() {
        super("Simple Quiz");
        q1 = new JLabel("1. Java is a ___ language?");
        r1a = new JRadioButton("Programming");
        r1b = new JRadioButton("Markup");
        r1c = new JRadioButton("Scripting");
        g1 = new ButtonGroup();
        g1.add(r1a);
        g1.add(r1b);
        g1.add(r1c);
        q2 = new JLabel("2. Which of these are fruits?");
        c2a = new JCheckBox("Apple");
        c2b = new JCheckBox("Carrot");
        c2c = new JCheckBox("Banana");
        q3 = new JLabel("3. What is 2 + 2?");
        t3 = new JTextField(10);
        result = new JTextArea(5, 25);
        result.setEditable(false);
        submit = new JButton("Submit");
        show = new JButton("Show Answers");
        submit.addActionListener(this);
        show.addActionListener(this);
        setLayout(new FlowLayout(FlowLayout.LEFT, 15, 10));
        add(q1);
        add(r1a);
        add(r1b);
        add(r1c);
        add(q2);
        add(c2a);
        add(c2b);
        add(c2c);
        add(q3);
        add(t3);
        add(submit);
        add(show);
        add(new JScrollPane(result));
        setSize(350, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void calcScore() {
        score = 0;
        if (r1a.isSelected())
            score++;
        if (c2a.isSelected() && c2c.isSelected() && !c2b.isSelected())
            score++;
        if (t3.getText().trim().equals("4"))
            score++;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            calcScore();
            result.setText("Your total score is: " + score + " / 3");
        } else if (e.getSource() == show) {
            result.setText("Correct Answers:\n" +
                    "1. Programming\n" +
                    "2. Apple, Banana\n" +
                    "3. 4");
        }
    }

    public static void main(String[] args) {
        System.out.println("Name: P.RAMANUJAM   Roll No: 2024503525");
        new SimpleQuiz();
    }
}

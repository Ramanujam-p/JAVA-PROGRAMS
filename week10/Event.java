import javax.swing.*;
import java.awt.*;

public class Event extends JFrame {
    Event() {
        super("event");
        JButton b = new JButton("click me");
        b.addActionListener(e -> {
            System.out.println("The button is clicked");
        });
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Event();
    }
}

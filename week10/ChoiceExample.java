import java.awt.*;
import java.awt.event.*;

public class ChoiceExample extends Frame implements ItemListener {
    Label l1, l2;
    Choice c1;

    public ChoiceExample() {
        super("Example for choice component in awt");
        setLayout(new FlowLayout());
        l1 = new Label("enter your department:");
        l2 = new Label(" ");
        c1 = new Choice();
        c1.add("cse");
        c1.add("ece");
        c1.add("it");
        c1.add("aero");
        add(l1);
        add(c1);
        add(l2);
        c1.addItemListener(this);
        setSize(300, 150);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void itemStateChanged(ItemEvent e) {
        String s = c1.getSelectedItem();
        l2.setText("Selected:" + s);
    }

    public static void main(String[] args) {
        new ChoiceExample();
    }
}

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class pro2 extends JFrame implements ItemListener {
    JCheckBox c1, c2;
    JLabel l;

    pro2() {
        super("checkbox");
        setLayout(new FlowLayout());
        l = new JLabel("select items:");
        c1 = new JCheckBox("Reading");
        c2 = new JCheckBox("writing");
        c1.addItemListener(this);
        c2.addItemListener(this);
        add(l);
        add(c1);
        add(c2);
        setVisible(true);
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent e) {
        String m = "Selected:";
        if (c1.isSelected())
            m += "Reading";
        if (c2.isSelected())
            m += "writing";
        l.setText(m);
    }

    public static void main(String[] args) {
        new pro2();
    }
}

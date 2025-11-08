import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class pro1 extends Frame implements ItemListener {
    Checkbox c1, c2, c3;
    Label l;
    TextArea t1;

    pro1() {
        setLayout(new FlowLayout());
        c1 = new Checkbox("reading");
        c2 = new Checkbox("writing");
        c3 = new Checkbox("playing");
        l = new Label("Select your items:");
        t1 = new TextArea();
        add(l);
        add(c1);
        add(c2);
        add(c3);
        add(t1);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        setSize(300, 300);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }

    public void itemStateChanged(ItemEvent e) {
        String m = "Selected:";
        if (c1.getState())
            m += "reading";
        if (c2.getState())
            m += "writing";
        if (c3.getState())
            m += "playing";
        l.setText(m);
    }

    public static void main(String[] args) {
        new pro1();
    }

}

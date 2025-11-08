import java.awt.*;
import java.awt.event.*;

public class file3 extends Frame implements ActionListener {
    Checkbox c1, c2, c3;
    CheckboxGroup g;
    Label l1, l2;
    Button b;

    public file3() {
        super("Example for CheckboxGroup");
        setLayout(new FlowLayout());

        l1 = new Label("Select gender:");
        g = new CheckboxGroup();

        // Create radio button style checkboxes
        c1 = new Checkbox("Male", g, false);
        c2 = new Checkbox("Female", g, false);
        c3 = new Checkbox("Others", g, false);

        l2 = new Label("Result:");
        b = new Button("Show Selected");

        add(l1);
        add(c1);
        add(c2);
        add(c3);
        add(b);
        add(l2);

        // Register ActionListener
        b.addActionListener(this);

        setSize(300, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            // Correct way: do NOT use "new" before g.getSelectedCheckbox()
            Checkbox a = g.getSelectedCheckbox();
            if (a != null)
                l2.setText("Result: " + a.getLabel());
            else
                l2.setText("Result: none selected");
        }
    }

    public static void main(String[] args) {
        new file3();
    }
}

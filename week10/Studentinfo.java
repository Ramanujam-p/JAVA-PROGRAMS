import java.awt.*;
import java.awt.event.*;

public class Studentinfo extends Frame implements ActionListener, ItemListener {
    Label l1, l2, l3;
    TextField t1, t2;
    Choice c1;
    CheckboxGroup c2;
    Checkbox c3, c4, c5;
    TextArea ta1;
    Button b1, b2;

    Studentinfo() {
        super("Student information");
        setLayout(new FlowLayout());

        l1 = new Label("Enter your name:");
        l2 = new Label("Enter your Register number:");
        l3 = new Label("Select Department:");

        t1 = new TextField(15);
        t2 = new TextField(15);

        c1 = new Choice();
        c1.add("CSE");
        c1.add("ECE");
        c1.add("IT");
        c1.add("AERO");

        c2 = new CheckboxGroup();
        c3 = new Checkbox("Male", c2, false);
        c4 = new Checkbox("Female", c2, false);
        c5 = new Checkbox("Others", c2, false);

        ta1 = new TextArea("Enter address", 3, 20);

        b1 = new Button("Submit");
        b2 = new Button("Clear");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(c1);
        add(c3);
        add(c4);
        add(c5);
        add(ta1);
        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        c1.addItemListener(this);

        setSize(400, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String n = t1.getText();
            String r = t2.getText();
            String d = c1.getSelectedItem();
            Checkbox selected = c2.getSelectedCheckbox();
            String g = (selected != null) ? selected.getLabel() : "Not selected";
            String ad = ta1.getText();

            // Show details in dialog
            Dialog info = new Dialog(this, "Student Details", true);
            info.setLayout(new FlowLayout());
            Label msg = new Label(
                    "Name: " + n + ", RegNo: " + r + ", Dept: " + d + ", Gender: " + g + ", Address: " + ad);
            info.add(msg);
            Button ok = new Button("OK");
            info.add(ok);
            ok.addActionListener(ev -> info.dispose());
            info.setSize(350, 150);
            info.setVisible(true);
        }

        if (e.getSource() == b2) {
            t1.setText("");
            t2.setText("");
            ta1.setText("");
            c2.setSelectedCheckbox(null);
            c1.select(0);
            t1.requestFocus();
        }
    }

    public void itemStateChanged(ItemEvent e) {
        String s = c1.getSelectedItem();
        l3.setText("Selected: " + s);
    }

    public static void main(String[] args) {
        new Studentinfo();
    }
}

import java.awt.event.*;
import java.awt.*;

public class Loginformcode extends Frame implements ActionListener {
    Label l1, l2, l3;
    TextField t1, t2;
    Button b1, b2;

    Loginformcode() {
        super("Login form");
        l1 = new Label("enter username:");
        l2 = new Label("enter password:");
        l3 = new Label("");
        t1 = new TextField(5);
        t2 = new TextField(5);
        b1 = new Button("Login");
        b2 = new Button("clear");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        Panel form = new Panel(new GridLayout(3, 2, 10, 10));
        form.add(l1);
        form.add(t1);
        form.add(l2);
        form.add(t2);
        form.add(new Label(""));
        form.add(l3);

        Panel buttons = new Panel(new FlowLayout());
        buttons.add(b1);
        buttons.add(b2);

        add(form, BorderLayout.CENTER);
        add(buttons, BorderLayout.SOUTH);

        setSize(350, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String user = t1.getText();
            String pass = t2.getText();
            if (user.equals("Rama") && pass.equals("1234")) {
                l3.setText("Login Successfull");
                l3.setForeground(Color.green);
            } else {
                l3.setText("Invalid user name or password! try again");
                l3.setForeground(Color.red);
            }
        }
        if (e.getSource() == b2) {
            t1.setText("");
            t2.setText("");
            l3.setText("");
            t1.requestFocus();
        }
    }

    public static void main(String[] args) {
        new Loginformcode();
    }
}

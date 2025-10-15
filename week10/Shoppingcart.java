import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Shoppingcart extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JComboBox<String> cb;
    JTextArea ta;
    JButton b1, b2, b3;
    ArrayList<String> list = new ArrayList<>();
    double total = 0.0;
    String[] items = { "Select item", "Apple - 50", "Banana - 20", "Milk - 40", "Bread - 30", "Eggs - 60" };
    double[] price = { 0, 50, 20, 40, 30, 60 };

    Shoppingcart() {
        super("Shopping Cart");
        l1 = new JLabel("Choose an item:");
        cb = new JComboBox<>(items);
        b1 = new JButton("Add");
        l2 = new JLabel("Your Cart:");
        ta = new JTextArea(10, 25);
        ta.setEditable(false);
        b2 = new JButton("Total");
        l3 = new JLabel("Total: ₹0.00");
        b3 = new JButton("Clear");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        setLayout(new FlowLayout(FlowLayout.LEFT, 15, 10));
        add(l1);
        add(cb);
        add(b1);
        add(l2);
        add(new JScrollPane(ta));
        add(b2);
        add(l3);
        add(b3);
        setSize(350, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            int i = cb.getSelectedIndex();
            if (i > 0) {
                list.add(items[i]);
                total += price[i];
                ta.append(items[i] + "\n");
            } else {
                JOptionPane.showMessageDialog(this, "Select a valid item!");
            }
        } else if (e.getSource() == b2) {
            l3.setText("Total:" + total);
        } else if (e.getSource() == b3) {
            list.clear();
            total = 0;
            ta.setText("");
            l3.setText("Total: 0.00");
        }
    }

    public static void main(String[] args) {
        System.out.println("Name: P.RAMANUJAM   Roll No: 2024503525");
        new Shoppingcart();
    }
}

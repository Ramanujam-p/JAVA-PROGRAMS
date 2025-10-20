import javax.swing.*;

public class file2 {
    public static void main(String[] args) {
        // JLabel = a GUI display area for a string of text , an image, or both
        JFrame a = new JFrame();
        a.setTitle("Study about labels");
        ImageIcon i = new ImageIcon("WhatsApp Image 2024-12-26 at 20.05.04_d5cdfc63.jpg");
        a.setSize(400, 400);
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // JLabel = a GUI display area for a string of text, an image , or both
        JLabel b = new JLabel();// create a label
        b.setText("bro,do you even code?");// set text of label
        a.add(b);
        b.setIcon(i);
        b.setHorizontalTextPosition(JLabel.CENTER);// set text LEFT,CENTER,RIGHT OF imageicon
        b.setVerticalTextPosition(JLabel.TOP);// set text TOP,CENTER,BOTTOM of image
    }
}

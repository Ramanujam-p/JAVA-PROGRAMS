import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    MyFrame() {
        // JFrame = a GUI window to add components to
        this.setTitle("JFrame title goes here");// sets title of frame
        this.setSize(400, 400);// sets the x-dimension and y-dimension of frame
        this.setVisible(true);// make frame visible
        this.setResizable(false);// prevent frame from being resized
        ImageIcon b = new ImageIcon("WhatsApp Image 2024-12-26 at 20.05.04_d5cdfc63.jpg");// create an ImageIcon
        this.setIconImage(b.getImage());// change icone of frame
        this.getContentPane().setBackground(Color.green);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application
    }
}

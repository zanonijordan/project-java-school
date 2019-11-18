package mws_2018_039.testswing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestGridLY {
    public static void main(String args[]) {
        JFrame win = new JFrame("Prima finestra");
        
        Container c = win.getContentPane();
        c.setLayout( new GridLayout(3, 2) );
        c.add(new JLabel("BL1"));
        c.add(new JLabel("BL2"));
        c.add(new JLabel("BL3"));
        c.add(new JLabel("BL4"));
        c.add(new JLabel("BL5"));
        
        win.setSize(200, 300);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    }
}

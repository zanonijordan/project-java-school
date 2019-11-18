package mws_2018_039.testswing;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Swing01 {
    public static void main(String args[]) {
        JFrame win = new JFrame("Hello Swing!!!");
        
        Container c = win.getContentPane();
        c.setLayout( new FlowLayout(FlowLayout.RIGHT) );
        c.add(new JLabel("Lele"));
        c.add(new JLabel("Livio"));
        c.add(new JLabel("Luigi"));
        
        win.setSize(200, 300);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
        
        // RIPETO
        JFrame win2 = new JFrame("Hello Swing 2!!!");
        
        Container c2 = win2.getContentPane();
        c2.setLayout( new FlowLayout(FlowLayout.RIGHT) );
        c2.add(new JLabel("Lele"));
        c2.add(new JLabel("Livio"));
        c2.add(new JLabel("Luigi"));
        
        win2.setSize(200, 300);
        win2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win2.setVisible(true);
    }
}
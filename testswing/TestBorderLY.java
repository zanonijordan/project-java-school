/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mws_2018_039.testswing;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestBorderLY {
    public static void main(String[] args) {
        JFrame win = new JFrame("Prima finestra");
        Container c = win.getContentPane();
        c.setLayout(new BorderLayout()); 
        
        
        JLabel l1 = new JLabel("L1");
        l1.setHorizontalAlignment(  JLabel.CENTER);
        l1.setVerticalAlignment(    JLabel.CENTER);
        
        JLabel l2 = new JLabel("L2");
        l2.setHorizontalAlignment(  JLabel.CENTER);
        l2.setVerticalAlignment(    JLabel.CENTER);
        
        JLabel l3 = new JLabel("L3");
        l3.setHorizontalAlignment(  JLabel.CENTER);
        l3.setVerticalAlignment(    JLabel.CENTER);
        
        JLabel l4 = new JLabel("L4");
        l4.setHorizontalAlignment(  JLabel.CENTER);
        l4.setVerticalAlignment(    JLabel.CENTER);
        
        JLabel l5 = new JLabel("L5");
        l5.setHorizontalAlignment(  JLabel.CENTER);
        l5.setVerticalAlignment(    JLabel.CENTER);
        
        c.add(l1,     BorderLayout.NORTH);
        c.add(l2,     BorderLayout.CENTER); 
        c.add(l3,     BorderLayout.EAST); 
        c.add(l4,     BorderLayout.WEST); 
        c.add(l5,     BorderLayout.SOUTH);
        win.setSize(200, 300);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    }
}

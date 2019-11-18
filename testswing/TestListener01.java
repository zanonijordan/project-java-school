/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mws_2018_039.testswing;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

 class MyFrame2 extends JFrame {

    JButton uno = new JButton("Uno");
    JButton due = new JButton("Due");
    JButton tre = new JButton("Tre");
    JButton quattro = new JButton("Quattro");
    JButton cinque = new JButton("Cinque");
    Ascoltatore listener = new Ascoltatore();

    public MyFrame2() {

        Container c = this.getContentPane();
        
        c.add(uno);
        c.add(cinque);
        
        uno.addActionListener(listener);
        cinque.addActionListener(listener);
        
        setLayout(new FlowLayout());
        setSize(300, 300);
        setVisible(true);
    }
    
   
}

public class TestListener01 {
   public static void main(String[] args) {
        MyFrame2 ts3 = new MyFrame2();
    } 
}

class Ascoltatore implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent event) {
        JButton b = (JButton) event.getSource();
        System.out.println("Click!! ...." + b.getText() );
        //JOptionPane.showMessageDialog(null, "È stato premuto" + b.getText());
        //JOptionPane.showMessageDialog(null, "alert", "titolo", JOptionPane.WARNING_MESSAGE);
    }
}
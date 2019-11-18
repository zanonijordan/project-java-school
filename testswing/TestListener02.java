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

 class MyFrame0 extends JFrame {

    public MyFrame0() {

        Container c = this.getContentPane();
        
        JButton registra = new JButton("Registra");
        JButton stampa   = new JButton("Stampa");
        
        c.add(registra);
        c.add(stampa);
        
        registra.addActionListener( new AscoltatoreRegistra());
        registra.addActionListener( new AscoltatoreLog());
        
        stampa.addActionListener( new AscoltatoreStampa());
        stampa.addActionListener( new AscoltatoreLog());
        
        setLayout(new FlowLayout());
        setSize(300, 300);
        setVisible(true);
    }
    
   
}

public class TestListener02 {
   public static void main(String[] args) {
        MyFrame0 ts3 = new MyFrame0();
    } 
}

class AscoltatoreRegistra implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("Registro nel DB..." );
    }
}


class AscoltatoreStampa implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("Stampo ...." );
    }
}

class AscoltatoreLog implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("Click .... "+ ((JButton)event.getSource()).getText() );
    }
}
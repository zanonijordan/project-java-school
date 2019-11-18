package mws_2018_039.testswing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Swing04 {
    public static void main(String[] args) {
        
        
        
        MiaFinestra2 f = new MiaFinestra2("Lele");
        
    }
    
}

class MiaFinestra2 extends JFrame {

    public MiaFinestra2( String t ) throws HeadlessException {
        super( t );
        Container c = this.getContentPane();
        c.setLayout( new GridLayout(5, 4));

        for(int i=0; i<28; i++){
            c.add(  new JLabel("L"+i) );
        }


        this.setSize(200, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
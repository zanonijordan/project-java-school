package mws_2018_039.testswing;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class TestWin extends JFrame{

    public TestWin( String t ) {
        Container c = this.getContentPane();
        c.setLayout( new FlowLayout(FlowLayout.CENTER) );
        
        JLabel c1 = new JLabel("Etichetta");
        JTextField c2 = new JTextField("Inpute text");
        JButton c3 = new JButton("cliccami");
        JCheckBox c4 = new JCheckBox("Si?");
        c4.setSelected(true);
        
        String[] petStrings = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
        JComboBox petList = new JComboBox(petStrings);
        
        
        JRadioButton option1 = new JRadioButton("Linux");
        JRadioButton option2 = new JRadioButton("Windows");
        JRadioButton option3 = new JRadioButton("Macintosh");
 
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);
 
        option3.setSelected(true);
        
        c.add( c1 );
        c.add( c2 );
        c.add( c3 );
        c.add( c4 );
        c.add(option1);
        c.add(option2);
        c.add(option3);
        c.add( petList );
        c.add( new JTextArea(10, 20) );
        
        this.setSize(200, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
}

public class Swing03 {
    public static void main(String[] args) {
        new TestWin( "Ciao" );
    }
}

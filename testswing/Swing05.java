package mws_2018_039.testswing;

import java.awt.BorderLayout;
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
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Swing05 {
    public static void main(String[] args) {
        
        /* INNER CLASS */
        class MiaFinestra extends JFrame {

            public MiaFinestra( String t ) throws HeadlessException {
                super( t );
                Container c = this.getContentPane();
                c.setLayout( new BorderLayout());

                //c.add( new JButton("NORD"),   BorderLayout.NORTH );
                c.add( new JButton("EST"),    BorderLayout.EAST );
                //c.add( new JButton("SUD"),    BorderLayout.SOUTH );
                //c.add( new JButton("OVEST"),  BorderLayout.WEST );
                c.add( new JTextArea(), BorderLayout.CENTER );
                

                JPanel nord = new JPanel(new FlowLayout(FlowLayout.CENTER));
                JRadioButton option1 = new JRadioButton("Linux");
                JRadioButton option2 = new JRadioButton("Windows");
                JRadioButton option3 = new JRadioButton("Macintosh");

                ButtonGroup group = new ButtonGroup();
                group.add(option1);
                group.add(option2);
                group.add(option3);
                nord.add(option1);
                nord.add(option2);
                nord.add(option3);
                c.add( nord,   BorderLayout.NORTH );
                
                
                JPanel sud = new JPanel( new FlowLayout(FlowLayout.RIGHT) );
                sud.add( new JButton("Registra") );
                sud.add( new JButton("Annulla") );
                
                c.add( sud,    BorderLayout.SOUTH );
                
                this.setSize(200, 300);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setVisible(true);
            }

        }
        
        MiaFinestra f = new MiaFinestra("Lele");
        
    }
    
}


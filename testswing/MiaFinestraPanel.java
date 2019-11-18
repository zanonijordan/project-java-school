package mws_2018_039.testswing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MiaFinestraPanel extends JFrame {

    public MiaFinestraPanel( String t ) throws HeadlessException {
        super( t );
        Container c = getContentPane();
        c.setLayout( new FlowLayout(FlowLayout.LEFT) );
        
        /* inserisco contenuto */
        JPanel left  = new JPanel( );
        JPanel right = new JPanel( );
        left.setLayout( new FlowLayout(FlowLayout.LEFT));
        right.setLayout(new FlowLayout(FlowLayout.RIGHT));
        left.setSize( 400, 30);
        right.setSize(200, 200);
        left.add( new JLabel("ciao1") );
        left.add( new JLabel("ciao1") );
        left.add( new JLabel("ciao1") );
        left.add( new JLabel("ciao1") );
        left.add( new JLabel("ciao1") );
        
        right.add( new JButton("ciao2") );
        
        c.add( left );
        c.add( right );
        
        this.setSize(200, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
}

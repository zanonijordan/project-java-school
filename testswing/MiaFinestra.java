package mws_2018_039.testswing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MiaFinestra extends JFrame {

    public MiaFinestra(String titolo, boolean main, String msg) throws HeadlessException {
        super( titolo );
        Container c = this.getContentPane();
        c.setLayout( new FlowLayout(FlowLayout.LEFT) );
        c.add(new JLabel( msg ));
        
        c.add( new JButton("clicca "+ msg) );
        
        
        this.setSize(200, 300);
        if(main)this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
}
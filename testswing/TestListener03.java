package mws_2018_039.testswing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class MyFrame3 extends JFrame {

    public MyFrame3() {

        Container c = this.getContentPane();

        JTextField nome = new JTextField();
        nome.setColumns(10);
        c.add( nome );

        JButton registra = new JButton("Registra");
        c.add(registra);
        
        JLabel esito = new JLabel();
        c.add( esito );

        registra.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("registo: "+ nome.getText());
                esito.setText("Ho registrato: "+ nome.getText() );
                nome.setText("");
            }
        });

        setLayout(new FlowLayout());
        setSize(300, 300);
        setVisible(true);
    }
}
    
  
public class TestListener03 {
   public static void main(String[] args) {
        new MyFrame3();
    } 
}
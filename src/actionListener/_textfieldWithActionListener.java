package actionListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _textfieldWithActionListener extends JFrame implements ActionListener{

    JTextField t1, t2, t3;
    JButton b1, b2;
    _textfieldWithActionListener(){

        t1 = new JTextField();
        t1.setBounds(50, 40, 130, 20);
        t2 = new JTextField();
        t2.setBounds(50, 70, 130, 20);
        t3 = new JTextField();
        t3.setBounds(50, 100, 130, 20);
        t3.setEditable(false);

        b1 = new JButton("+");
        b1.setBounds(50, 130, 130, 20);
        b2 = new JButton("*");
        b2.setBounds(50, 170, 130, 20);

        b1.addActionListener(this);
        b2.addActionListener(this);

        add(t1);
        add(t2);
        add(t3);
        add(b1);
        add(b2);

        setVisible(true);
        setLayout(null);
        setSize(300, 300);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String s1 = t1.getText();
        String s2 = t2.getText();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);

        int c = 0;

        if(e.getSource() == b1){
            c = a +b;
        } else if (e.getSource() == b2) {
            c = a*b;
        }
        String resultado = String.valueOf(c);
        t3.setText(resultado);
    }

    public  static void main(String[] args){
    new _textfieldWithActionListener();
    }
}

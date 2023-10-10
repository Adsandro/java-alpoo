package actionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _jbutton extends Frame {
    JButton bt;
    _jbutton(){
        bt = new JButton();
        final JTextField tf = new JTextField();
        tf.setBounds(50,50,150, 20);
        bt.setBounds(50, 100, 95, 30);

        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("teste");
            }
        });

        add(tf);
        add(bt);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args){
        new _jbutton();
    }
}

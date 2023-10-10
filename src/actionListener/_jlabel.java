package actionListener;

import javax.swing.*;
import java.awt.*;

public class _jlabel extends Frame {
    JLabel lb1, lb2;
    _jlabel(){
        lb1 = new JLabel("texto1");
        lb2 = new JLabel("texto2");

        lb1.setBounds(50, 50, 150, 30);
        lb2.setBounds(50, 100, 150, 30);

        add(lb1);
        add(lb2);


        setSize(400, 400);
        setVisible(true);
        setLayout(null);
    }
    public static void main(String[] args){
        new _jlabel();
    }
}

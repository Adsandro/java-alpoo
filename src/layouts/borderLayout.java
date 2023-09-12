package layouts;

import javax.swing.*;
import java.awt.*;

public class borderLayout extends Frame {

    JButton b1,b2,b3,b4,b5;
    borderLayout(){
        b1 = new JButton("NORTE");
        b2 = new JButton("SUL");
        b3 = new JButton("ESTE");
        b4 = new JButton("OESTE");
        b5 = new JButton("CENTRO");

        setLayout(new BorderLayout(20, 15));
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);

        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args){
        new borderLayout();
    }
}

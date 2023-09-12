package layouts;

import javax.swing.*;
import java.awt.*;

public class gridLayout extends Frame {
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    gridLayout(){
        b1 = new JButton("BOTAO 1");
        b2 = new JButton("BOTAO 2");
        b3 = new JButton("BOTAO 3");
        b4 = new JButton("BOTAO 4");
        b5 = new JButton("BOTAO 5");
        b6 = new JButton("BOTAO 6");
        b7 = new JButton("BOTAO 7");
        b8 = new JButton("BOTAO 8");
        b9 = new JButton("BOTAO 9");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);

        setLayout(new GridLayout(3, 3, 20, 25));
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args){
        new gridLayout();
    }
}

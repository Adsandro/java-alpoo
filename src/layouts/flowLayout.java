package layouts;

import javax.swing.*;
import java.awt.*;

public class flowLayout extends Frame {

    JButton b1, b2, b3, b4;
    flowLayout(){
        b1 = new JButton("BOTAO 1");
        b2 = new JButton("BOTAO 2");
        b3 = new JButton("BOTAO 3");
        b4 = new JButton("BOTAO 4");

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        setSize(300,300);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setVisible(true);
    }
    public static void main(String[] args){
        new flowLayout();
    }
}

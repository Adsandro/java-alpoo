package swing;

import javax.swing.*;
import java.awt.*;

public class sampleJpanel extends JFrame {
    JPanel p1, p2, p3;
    JLabel l1, l2, l3;
    JButton b1, b2, b3;
    sampleJpanel(){
        p1 = new JPanel();
        l1 = new JLabel("Painel dark Gray");
        b1 = new JButton("Botão 1");
        p1.setBackground(Color.DARK_GRAY);
        p1.add(l1);
        p1.add(b1);
        add(p1);

        p2 = new JPanel();
        l2 = new JLabel("Painel magenta");
        b2 = new JButton("Botão 2");
        p2.setBackground(Color.magenta);
        p2.add(l2);
        p2.add(b2);
        add(p2);

        p3 = new JPanel();
        l3 = new JLabel("Painel pink");
        b3 = new JButton("Botão 2");
        p3.setBackground(Color.pink);
        p3.add(l3);
        p3.add(b3);
        add(p3);

        setLayout(new FlowLayout());
        setVisible(true);
    }
    public static void main(String[] args) {
        sampleJpanel jp = new sampleJpanel();
        jp.setSize(300, 300);
        jp.setVisible(true);
    }
}

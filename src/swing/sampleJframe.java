package swing;

import javax.swing.*;
import java.awt.*;

public class sampleJframe extends JFrame {
    sampleJframe(){
        JButton b1 = new JButton("Botão 1");
        setTitle("Jframe com Swing");
        setSize(300, 300);
        add(b1);
        setLayout(new FlowLayout());
        setVisible(true);
    }
    public static void main(String[] args){
        sampleJframe jf = new sampleJframe();
    }
}

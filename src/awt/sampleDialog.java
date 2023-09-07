package awt;

import javax.swing.*;
import java.awt.*;

public class sampleDialog {
    sampleDialog(){
        Frame f1 = new Frame("Exemplo de dialogo");
        f1.setSize(300, 300);
        f1.setBackground(Color.gray);
        f1.setLayout(new FlowLayout());
        f1.setVisible(true);

        Dialog d1 = new Dialog(null, true);
        d1.setLayout(new FlowLayout());
        d1.setTitle("Novo dialogo");
        d1.setBackground(Color.orange);
        d1.setSize(300, 200);

        JButton b1 = new JButton("Novo botão");
        b1.setSize(20, 10);
        d1.add(b1);
        d1.setVisible(true);
    }
    public static void main(String[] args) {
        new sampleDialog();
    }
}

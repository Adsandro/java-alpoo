package optionPanel;

import javax.swing.*;

public class optionPaneExemple {
    JFrame f;
    optionPaneExemple(){
        f = new JFrame();
        String name = JOptionPane.showInputDialog(f, "teste", "new JOptionPane()");
    }
    public static void main(String[] args){
        new optionPaneExemple();
    }
}

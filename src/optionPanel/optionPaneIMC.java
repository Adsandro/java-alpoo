package optionPanel;

import javax.swing.*;
import java.awt.*;

public class optionPaneIMC extends Frame {

    optionPaneIMC(){
        String altura = JOptionPane.showInputDialog("Altura");
        String peso = JOptionPane.showInputDialog("Peso");
    }
    public static void main(String[] args){
        new optionPaneIMC();
    }
}
